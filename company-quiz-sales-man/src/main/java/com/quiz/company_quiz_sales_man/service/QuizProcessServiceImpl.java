package com.quiz.company_quiz_sales_man.service;

import com.quiz.company_quiz_sales_man.constant.QuizConstant;
import com.quiz.company_quiz_sales_man.dao.QuizDao;
import com.quiz.company_quiz_sales_man.dto.ApiResponse;
import com.quiz.company_quiz_sales_man.dto.QuizAttainedDto;
import com.quiz.company_quiz_sales_man.entity.OptionEntity;
import com.quiz.company_quiz_sales_man.entity.QuizAttainedEntity;
import com.quiz.company_quiz_sales_man.entity.QuizEntity;
import com.quiz.company_quiz_sales_man.helper.MongoDBHelper;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class QuizProcessServiceImpl implements QuizProcessService {

    private QuizDao quizDao;
    private MongoDBHelper mongoDBHelper;

    public QuizProcessServiceImpl(QuizDao quizDao, MongoDBHelper mongoDBHelper) {
        this.quizDao = quizDao;
        this.mongoDBHelper = mongoDBHelper;
    }

    @Override
    public ApiResponse processQuizAttained(String quizId, QuizAttainedDto quizAttainedDto) {
        Map<String, String> selectedAns = quizAttainedDto.getSelectedQesAns();
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setStatus(QuizConstant.TRUE);
        apiResponse.setMsg(QuizConstant.SUCCESS);
        List<String> optionIds = selectedAns
                .entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .toList();

        List<OptionEntity> correctOptns = mongoDBHelper.findNestedObject(quizId, optionIds);
        Map<Boolean, List<OptionEntity>> data = correctOptns
                .stream()
                .collect(Collectors
                        .partitioningBy(OptionEntity
                                ::getIsCorrect));

        apiResponse.setData(data);
        apiResponse.setStatus(Boolean.TRUE);
        apiResponse.setMsg(QuizConstant.SUCCESS);

        return apiResponse;
    }

    /*
     Call everytime to save each question's options
     This method has implemented for one scenario if user not able to submit test
    * */
    @Override
    public ApiResponse createAttainQuizReport(String quizId) {
        ApiResponse apiResponse = new ApiResponse();
        QuizAttainedEntity quizAttainedEntity = new QuizAttainedEntity();
        quizAttainedEntity.setQuizId(quizId);

        return apiResponse;
    }
}
