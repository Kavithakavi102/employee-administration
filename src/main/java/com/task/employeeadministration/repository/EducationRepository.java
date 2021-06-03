package com.task.employeeadministration.repository;

import com.task.employeeadministration.domain.entity.Education;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducationRepository extends JpaRepository<Education, Long> {
}
