package com.quiz.company_quiz_sales_man.entity;

import java.util.UUID;

public abstract class BaseEntity {

    private String uuid;

    public BaseEntity() {
        this.uuid = UUID.randomUUID().toString();
    }

    public String getUUID() {
        return this.uuid;
    }

}
