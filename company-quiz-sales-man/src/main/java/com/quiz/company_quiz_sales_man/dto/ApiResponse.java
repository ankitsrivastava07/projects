package com.quiz.company_quiz_sales_man.dto;

import lombok.Data;

@Data
public class ApiResponse {

    private String msg;
    private Object data;
    private Object error;
    private Boolean status;
}
