package com.quiz.company_quiz_sales_man.dto;

import lombok.Data;

@Data
public class LikeDto {

    private String userId;
    private String deviceId;
    private String sourceType;
    private String likeOrDislike;
}
