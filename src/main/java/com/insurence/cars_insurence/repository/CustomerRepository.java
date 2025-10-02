package com.insurence.cars_insurence.repository;

import com.insurence.cars_insurence.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Optional<Customer> findByEmail(String email);
    Customer findByName(String name);
}