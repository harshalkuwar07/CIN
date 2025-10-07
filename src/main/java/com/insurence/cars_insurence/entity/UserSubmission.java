package com.insurence.cars_insurence.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "user_submissions")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserSubmission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String phone;
    private String registration;
    private String year;
    private String brand;
    private String model;
    private String variant;
}