package com.quiz.company_quiz_sales_man.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.quiz.company_quiz_sales_man.entity.QuestionEntity;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface QuestionRepository extends MongoRepository<QuestionEntity, String> {

    @Query("{level: '?0', $in: {?1}}")
    List<QuestionEntity> findAllQuestions(String level, String subject);
}
