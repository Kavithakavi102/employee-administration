package com.task.employeeadministration.repository;

import com.task.employeeadministration.domain.entity.Experience;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperienceRepository extends JpaRepository<Experience, Long> {
}
