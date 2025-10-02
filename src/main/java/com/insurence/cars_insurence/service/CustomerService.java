package com.insurence.cars_insurence.service;

import com.insurence.cars_insurence.dto.Customerdto;
import com.insurence.cars_insurence.entity.Customer;
import com.insurence.cars_insurence.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;



    public Customer register(Customer request) {
        if (customerRepository.findByEmail(request.getEmail()).isPresent()) {
            return null;
        }
      return  customerRepository.save(request);
    }
    public Customer login(String name, String password) {
        Customer customer = customerRepository.findByName(name);
        if (customer != null && customer.getPassword().equals(password)) {
            return customer;
        }
        return null;
    }
}
