package com.quiz.company_quiz_sales_man.entity;

import lombok.Data;

@Data
public class AnswerEntity extends BaseEntity {

    private String comment;
    private String description;
    private String createdBy;

}
