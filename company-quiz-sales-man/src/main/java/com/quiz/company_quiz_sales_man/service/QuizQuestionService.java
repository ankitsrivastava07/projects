package com.quiz.company_quiz_sales_man.service;

import com.quiz.company_quiz_sales_man.dto.ApiResponse;
import com.quiz.company_quiz_sales_man.dto.CreateQuestionDto;
import com.quiz.company_quiz_sales_man.dto.QuizDto;

public interface QuizQuestionService {

    ApiResponse saveQuiz(QuizDto quizDto);

    ApiResponse saveQuestion(CreateQuestionDto createQuestionDto);

    ApiResponse getAllQuestions(String level, String subject);
}
