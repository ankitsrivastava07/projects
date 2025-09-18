package com.quiz.company_quiz_sales_man.dto;

import com.quiz.company_quiz_sales_man.constant.QuizConstantBoolean;
import lombok.Data;

import java.util.List;

@Data
public class CreateQuestionDto {

    private String question;
    private List<OptionDto> options;
    private List<String> answers;
    private QuizConstantBoolean active;
    private String subjectId;
    private String topicId;
}
