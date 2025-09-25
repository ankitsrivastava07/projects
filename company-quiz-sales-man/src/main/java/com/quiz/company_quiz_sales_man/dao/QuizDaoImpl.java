package com.quiz.company_quiz_sales_man.dao;

import com.quiz.company_quiz_sales_man.entity.QuestionEntity;
import com.quiz.company_quiz_sales_man.entity.QuizEntity;
import com.quiz.company_quiz_sales_man.repository.QuestionRepository;
import com.quiz.company_quiz_sales_man.repository.QuizRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.NoSuchElementException;

@Repository
public class QuizDaoImpl implements QuizDao {

    private QuestionRepository questionRepository;
    private QuizRepository quizRepository;

    public QuizDaoImpl(QuestionRepository questionRepository, QuizRepository quizRepository) {
        this.questionRepository = questionRepository;
        this.quizRepository = quizRepository;
    }

    @Override
    public QuestionEntity saveQuestion(QuestionEntity questionEntity) {
        return questionRepository.save(questionEntity);
    }

    @Override
    public QuizEntity saveQuiz(QuizEntity quizEntity) {
        return quizRepository.save(quizEntity);
    }

    @Override
    public List<QuestionEntity> findAllQuestions(String level, String subject) {
        return questionRepository.findAll();
    }

    @Override
    public QuizEntity findById(String _id) {
        return quizRepository.findById(_id).orElseThrow(() -> new NoSuchElementException("Quiz Entity with this id does not exist" + _id));
    }

}

