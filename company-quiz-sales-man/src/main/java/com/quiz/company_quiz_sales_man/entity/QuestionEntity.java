package com.quiz.company_quiz_sales_man.entity;

import com.quiz.company_quiz_sales_man.constant.QuizConstantBoolean;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "questions")
public class QuestionEntity {

    @Id
    private String _id;
    private String question;
    private List<OptionEntity> options;
    private List<AnswerEntity> answers;
    private QuizConstantBoolean active;
    private Date createdAt;
    private Date updatedAt;
    private String level;
    private String subjectId;
    private String topicId;

}
