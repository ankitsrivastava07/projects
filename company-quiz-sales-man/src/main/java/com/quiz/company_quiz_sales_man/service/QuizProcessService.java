package com.quiz.company_quiz_sales_man.service;

import com.quiz.company_quiz_sales_man.dto.ApiResponse;
import com.quiz.company_quiz_sales_man.dto.QuizAttainedDto;

public interface QuizProcessService {

    ApiResponse createAttainQuizReport(String quizId);

    ApiResponse processQuizAttained(String quidId, QuizAttainedDto quizAttainedDto);

}
