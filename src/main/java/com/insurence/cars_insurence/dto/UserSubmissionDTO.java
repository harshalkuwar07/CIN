package com.insurence.cars_insurence.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserSubmissionDTO {
    private String name;
    private String phone;
    private String registration;
    private String year;
    private String brand;
    private String model;
    private String variant;
}
