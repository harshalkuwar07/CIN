package com.insurence.cars_insurence.service;


import com.insurence.cars_insurence.dto.UserSubmissionDTO;
import com.insurence.cars_insurence.entity.UserSubmission;
import com.insurence.cars_insurence.mapper.SubmissionMapper;
import com.insurence.cars_insurence.repository.UserSubmissionRepository;
import org.springframework.stereotype.Service;

@Service
public class SubmissionServiceImpl implements SubmissionService {

    private final UserSubmissionRepository repository;
    private final SubmissionMapper mapper;

    public SubmissionServiceImpl(UserSubmissionRepository repository, SubmissionMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public void saveSubmission(UserSubmissionDTO submissionDTO) {
        UserSubmission entity = mapper.toEntity(submissionDTO);
        repository.save(entity);
}
}