package com.quiz.company_quiz_sales_man.service;

import com.quiz.company_quiz_sales_man.dto.ApiResponse;
import com.quiz.company_quiz_sales_man.dto.CreateQuestionDto;
import com.quiz.company_quiz_sales_man.dto.QuizAttainedDto;
import com.quiz.company_quiz_sales_man.dto.QuizDto;

public interface QuizQuestionService {

    ApiResponse saveQuiz(String userName, QuizDto quizDto);

    @Deprecated
    ApiResponse saveQuestion(CreateQuestionDto createQuestionDto);

    ApiResponse getQuizById(String quizId);

    ApiResponse processQuizReport(String quizId, QuizAttainedDto quizAttainedDto);
}
