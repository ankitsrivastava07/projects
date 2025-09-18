package com.quiz.company_quiz_sales_man.dto;

import lombok.Data;

import java.util.List;

@Data
public class QuizDto {

    private String company;
    private String level;
    private String title;
    private String description;
    private Boolean status;
    private String userId;
    private List<CreateQuestionDto> questions;
    private List<SubjectDto> subjectDtos;
}
