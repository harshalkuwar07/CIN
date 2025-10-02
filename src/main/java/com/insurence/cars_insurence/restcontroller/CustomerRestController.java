package com.insurence.cars_insurence.restcontroller;

import com.insurence.cars_insurence.entity.Customer;
import com.insurence.cars_insurence.service.CustomerService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRestController {
    @Autowired
    private CustomerService customerService;
    @PostMapping("/register")
    public ResponseEntity<?> registerCustomer(@RequestBody Customer customer)
    {
       Customer registered = customerService.register(customer);
       if (registered == null)
       {
           return ResponseEntity.status(HttpStatus.CONFLICT)
                   .body("{\"error\": \"Username already exists\"}");
       }
       return ResponseEntity.ok("registration successfully");
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody Customer user, HttpServletRequest request) {
        Customer loggedIn = customerService.login(user.getName(), user.getPassword());
        if (loggedIn == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body("{\"error\": \"Invalid username or password\"}");
        }
        // Set session attributes
        request.getSession().setAttribute("username", loggedIn.getName());
        request.getSession().setAttribute("role", loggedIn.getEmail());
        return ResponseEntity.ok(loggedIn); // this will be JSON
    }
}
