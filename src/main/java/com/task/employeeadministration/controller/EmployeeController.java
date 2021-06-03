package com.task.employeeadministration.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.task.employeeadministration.domain.entity.Employee;
import com.task.employeeadministration.domain.mapper.RequestMapper;
import com.task.employeeadministration.domain.request.EmployeeRequest;
import com.task.employeeadministration.domain.response.SuccessResponse;
import com.task.employeeadministration.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/employees", produces = {MediaType.APPLICATION_JSON_VALUE})
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;
    @Autowired
    RequestMapper requestMapper;

    @PostMapping(value = "{fileName}")
    public ResponseEntity<SuccessResponse> createEmployee(@PathVariable String fileName){
        log.info("Name of the file received fileName: {}", fileName);
        SuccessResponse successResponse = null;
        try {
            EmployeeRequest employeeRequest = convertJsonToObject(fileName, EmployeeRequest.class);
            Employee employee = requestMapper.mapRequestToEntity(employeeRequest);
            String id = employeeService.createEmployee(employee);
            successResponse = assembleResponse(id, HttpStatus.CREATED.value());
        } catch (IOException e) {
            log.error("Exception occurred while creating employee {}",e);
        }
        log.info("Create Employee response {}", successResponse);
        return new ResponseEntity<SuccessResponse>(successResponse, HttpStatus.CREATED);
    }

    @GetMapping()
    public List<Employee> getEmployees(){
        log.info("Employee getDetails");
        return employeeService.getEmployees();
    }

    private EmployeeRequest convertJsonToObject(String fileName, Class<EmployeeRequest> t) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ClassLoader classLoader = this.getClass().getClassLoader();
        File inputRequest = new File(classLoader.getResource(fileName).getFile());
        return mapper.readValue(inputRequest, EmployeeRequest.class);
    }

    private SuccessResponse assembleResponse(String id, int httpStatusCode) {
        return  SuccessResponse.builder()
                .id(id)
                .httpStatus(httpStatusCode)
                .build();
    }
}
