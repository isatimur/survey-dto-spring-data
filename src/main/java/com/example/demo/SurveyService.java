package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurveyService {
    private SurveyRepository repository;

    public SurveyService(SurveyRepository repository) {
        this.repository = repository;
    }

    List<SurveyDto> getSurveys(){
        return repository.findAll();
    }
}
