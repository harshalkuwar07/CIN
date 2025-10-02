package com.insurence.cars_insurence.controller;

import com.insurence.cars_insurence.dto.Customerdto;
import com.insurence.cars_insurence.entity.Customer;
import com.insurence.cars_insurence.repository.CustomerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {

    private final CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    // Show register page
    @GetMapping("/register")
    public String showRegisterPage() {
        return "register"; // register.html
    }



}
