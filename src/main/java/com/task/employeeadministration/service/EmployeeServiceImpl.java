package com.task.employeeadministration.service;

import com.task.employeeadministration.domain.entity.*;
import com.task.employeeadministration.repository.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    VersionRepository versionRepository;
    @Autowired
    EmailRepository emailRepository;
    @Autowired
    ExperienceRepository experienceRepository;
    @Autowired
    EducationRepository educationRepository;
    @Autowired
    ProfileRepository profileRepository;

    @Transactional
    @Override
    public String createEmployee(Employee employees) {
        log.info("Processing Json Data");
        List<Email> emails = emailRepository.saveAll(employees.getEmails());
        List<Experience> experiences = experienceRepository.saveAll(employees.getExperience());
        List<Education> educations = educationRepository.saveAll(employees.getEducation());
        List<Profile> profiles = profileRepository.saveAll(employees.getProfiles());
        Version version = versionRepository.save(employees.getVersion_status_sno());
        employees.setEmails(emails);
        employees.setEducation(educations);
        employees.setExperience(experiences);
        employees.setProfiles(profiles);
        employees.setVersion_status_sno(version);
        Employee employee = employeeRepository.saveAndFlush(employees);
        log.info("Employee details uploaded in DB for id: {}",employee.getId());
        return employee.getId();
    }

    @Override
    public List<Employee> getEmployees() {
         return employeeRepository.findAll();
    }
}
