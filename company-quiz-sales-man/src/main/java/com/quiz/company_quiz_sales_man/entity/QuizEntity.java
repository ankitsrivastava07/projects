package com.quiz.company_quiz_sales_man.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Data
@Document
public class QuizEntity {

    @Id
    private String id;
    private List<QuestionEntity> questions;
    private Date createdAt;
    private Date updatedAt;
    private String userId;
    private Boolean status;
}
