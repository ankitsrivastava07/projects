package com.quiz.company_quiz_sales_man.entity;

import lombok.Data;

@Data
public class AnswerEntity extends BaseEntity {
    private String answer;
    private String createdBy;

    public AnswerEntity(String answer) {
        this.answer = answer;
    }
}
