package com.task.employeeadministration.repository;

import com.task.employeeadministration.domain.entity.Email;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<Email, Long> {
}
