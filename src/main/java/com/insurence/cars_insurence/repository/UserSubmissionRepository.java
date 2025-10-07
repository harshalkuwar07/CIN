package com.insurence.cars_insurence.repository;

import com.insurence.cars_insurence.entity.UserSubmission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSubmissionRepository extends JpaRepository<UserSubmission, Long> {
}