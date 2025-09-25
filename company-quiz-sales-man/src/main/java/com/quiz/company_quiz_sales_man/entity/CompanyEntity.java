package com.quiz.company_quiz_sales_man.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "company")
public class CompanyEntity {

    private String name;
    private String description;
    private String exp;
    private Date createAt;
    private Date updatedAt;
}
