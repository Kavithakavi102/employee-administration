package com.task.employeeadministration.service;

import com.task.employeeadministration.domain.entity.Employee;

import java.util.List;

public interface EmployeeService {
    String createEmployee(Employee employee);

    List<Employee> getEmployees();
}
