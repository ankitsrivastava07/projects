package com.quiz.company_quiz_sales_man.dao;

import com.quiz.company_quiz_sales_man.entity.QuestionEntity;
import com.quiz.company_quiz_sales_man.entity.QuizEntity;
import com.quiz.company_quiz_sales_man.repository.QuestionRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class QuizQuestionDaoImpl implements QuizQuestionDao {

    private QuestionRepository questionRepository;

    public QuizQuestionDaoImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public QuestionEntity saveQuestion(QuestionEntity questionEntity) {
        return questionRepository.save(questionEntity);
    }

    @Override
    public QuizEntity saveQuiz(QuizEntity quizEntity) {
        return null;
    }

    @Override
    public List<QuestionEntity> findAllQuestions(String level, String subject) {
        return questionRepository.findAll();
    }

}

