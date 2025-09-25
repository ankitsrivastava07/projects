package com.quiz.company_quiz_sales_man.dto;

import lombok.Data;

import java.util.List;

@Data
public class OptionDto {
    private String opt;
    private Boolean isCorrect;
    private List<AnswerDto> answers;
}
