package com.quiz.company_quiz_sales_man.entity;

import lombok.Data;

import java.util.List;

@Data
public class OptionEntity extends BaseEntity {

    private String opt;
    private Boolean isCorrect;
    private List<AnswerEntity> answers;
    private String createdBy;
}
