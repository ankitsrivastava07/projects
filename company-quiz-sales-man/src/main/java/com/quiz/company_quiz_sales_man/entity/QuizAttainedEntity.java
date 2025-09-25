package com.quiz.company_quiz_sales_man.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Map;

@Data
public class QuizAttainedEntity extends BaseEntity {

    private String quizId;
    private String userId;
    private Map<String, List<String>> attendedRecord;

    private String submittedAt;
    private String system;
    private String version;
    private String ip;
    private String username;
    private String email;
    private String browser;
    private String name;
}
