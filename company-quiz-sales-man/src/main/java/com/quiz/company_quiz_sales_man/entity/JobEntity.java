package com.quiz.company_quiz_sales_man.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class JobEntity {

    private String title;
    private String description;
    private String expLevel;
    private String position;
    private String exp;
}
