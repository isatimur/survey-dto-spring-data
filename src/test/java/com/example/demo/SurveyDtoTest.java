package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.internal.matchers.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@SpringBootTest
public class SurveyDtoTest {

    @Autowired
    private SurveyService surveyService;

    @Test
    public void whenApplicationStarts_thenHibernateCreatesInitialRecords() {
        List<SurveyDto> surveys = surveyService.getSurveys();
        surveys.stream().findFirst().map(surveyDto -> {
                    System.out.println(surveyDto);
                    return null;
                }
        );
    }
}