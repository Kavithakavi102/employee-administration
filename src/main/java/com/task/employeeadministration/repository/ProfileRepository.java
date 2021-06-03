package com.task.employeeadministration.repository;

import com.task.employeeadministration.domain.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
}
