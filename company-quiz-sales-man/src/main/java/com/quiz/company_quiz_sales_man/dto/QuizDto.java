package com.quiz.company_quiz_sales_man.dto;

import lombok.Data;
import java.util.List;

@Data
public class QuizDto {

    private List<CompanyDto> company;
    private String level;
    private String title;
    private String description;
    private Boolean active;
    private String userId;
    private List<CreateQuestionDto> questions;
    private List<SubjectDto> subjects;
    private String commonAccess;
    private String username;

}
