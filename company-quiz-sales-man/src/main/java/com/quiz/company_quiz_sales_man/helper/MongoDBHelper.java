package com.quiz.company_quiz_sales_man.helper;

import com.quiz.company_quiz_sales_man.entity.OptionEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MongoDBHelper {

    @Autowired
    private MongoTemplate mongoTemplate;

    public List<OptionEntity> findNestedObject(String _id, List<String> optionIds) {

        Aggregation aggregation = Aggregation.newAggregation(
                Aggregation.match(Criteria.where("_id").is(_id)),
                Aggregation.unwind("questions"),
                Aggregation.unwind("questions.options"),
                Aggregation.match(Criteria.where("questions.options.uuid").in(optionIds)),
                Aggregation.replaceRoot("questions.options")
        );

        return mongoTemplate.aggregate(aggregation, "quizzes", OptionEntity.class)
                .getMappedResults();

    }

}
