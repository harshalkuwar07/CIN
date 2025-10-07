package com.insurence.cars_insurence.mapper;

import com.insurence.cars_insurence.dto.UserSubmissionDTO;
import com.insurence.cars_insurence.entity.UserSubmission;
import org.springframework.stereotype.Component;

@Component
public class SubmissionMapper {
    public UserSubmission toEntity(UserSubmissionDTO dto) {
        UserSubmission entity = new UserSubmission();
        entity.setName(dto.getName());
        entity.setPhone(dto.getPhone());
        entity.setRegistration(dto.getRegistration());
        entity.setYear(dto.getYear());
        entity.setBrand(dto.getBrand());
        entity.setModel(dto.getModel());
        entity.setVariant(dto.getVariant());
        return entity;
}
}