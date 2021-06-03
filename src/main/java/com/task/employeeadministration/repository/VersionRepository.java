package com.task.employeeadministration.repository;

import com.task.employeeadministration.domain.entity.Version;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VersionRepository extends JpaRepository<Version, Long> {
}
