package com.quiz.company_quiz_sales_man.dao;


import com.quiz.company_quiz_sales_man.entity.QuestionEntity;
import com.quiz.company_quiz_sales_man.entity.QuizEntity;

import java.util.List;

public interface QuizDao {

    QuestionEntity saveQuestion(QuestionEntity questionEntity);

    QuizEntity saveQuiz(QuizEntity quizEntity);

    List<QuestionEntity> findAllQuestions(String level, String subject);

    QuizEntity findById(String quizId);
}
