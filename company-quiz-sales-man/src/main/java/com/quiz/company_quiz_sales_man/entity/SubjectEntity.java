package com.quiz.company_quiz_sales_man.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Data
public class SubjectEntity {

    @Id
    private String id;
    private String title;
    private String name;
    private String description;
    private List<TopicEntity> topic;
    private String slugName;
}
