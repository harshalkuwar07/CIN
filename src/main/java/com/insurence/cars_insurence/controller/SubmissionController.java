package com.insurence.cars_insurence.controller;


import com.insurence.cars_insurence.dto.UserSubmissionDTO;
import com.insurence.cars_insurence.service.SubmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/submit")
@CrossOrigin(origins = "*") // allows frontend to connect
public class SubmissionController {

    @Autowired
    private  SubmissionService service;

    public SubmissionController(SubmissionService service) {
        this.service = service;
    }

    @PostMapping
    public String submitForm(@RequestBody UserSubmissionDTO dto) {
        service.saveSubmission(dto);
        return "Submitted successfully!";
}
}