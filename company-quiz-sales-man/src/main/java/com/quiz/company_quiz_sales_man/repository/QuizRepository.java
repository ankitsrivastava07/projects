package com.quiz.company_quiz_sales_man.repository;

import com.quiz.company_quiz_sales_man.entity.QuizEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface QuizRepository extends MongoRepository<QuizEntity, String> {
}
