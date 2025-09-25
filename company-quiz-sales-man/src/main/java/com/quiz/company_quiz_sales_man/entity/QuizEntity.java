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
    private String _id;
    private List<QuestionEntity> questions;
    private List<CompanyEntity> companies;
    private Date createdAt;
    private Date updatedAt;
    private String userId;
    private Boolean active;
    private String title;
    private String commonAccess;
    private String description;
    private String createdBy;
    private String level;
    private String subjectId;
    private String topicId;

}
