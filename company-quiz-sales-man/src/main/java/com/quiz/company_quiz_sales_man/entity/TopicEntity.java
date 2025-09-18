package com.quiz.company_quiz_sales_man.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.util.pattern.PathPattern;

@Data
@Document
public class TopicEntity {

    @Id
    private String id;
    private String name;
    private String slugName;
}
