package com.quiz.company_quiz_sales_man.service;

import com.quiz.company_quiz_sales_man.constant.QuizConstant;
import com.quiz.company_quiz_sales_man.constant.QuizConstantBoolean;
import com.quiz.company_quiz_sales_man.dao.QuizDao;
import com.quiz.company_quiz_sales_man.dto.ApiResponse;
import com.quiz.company_quiz_sales_man.dto.CreateQuestionDto;
import com.quiz.company_quiz_sales_man.dto.QuizAttainedDto;
import com.quiz.company_quiz_sales_man.dto.QuizDto;
import com.quiz.company_quiz_sales_man.entity.QuestionEntity;
import com.quiz.company_quiz_sales_man.entity.QuizAttainedEntity;
import com.quiz.company_quiz_sales_man.entity.QuizEntity;
import com.quiz.company_quiz_sales_man.mapper.CustomObjectMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class QuizQuestionServiceImpl implements QuizQuestionService {

    private final CustomObjectMapper customObjectMapper;
    private final QuizDao quizDao;

    public QuizQuestionServiceImpl(QuizDao quizDao,
                                   CustomObjectMapper customObjectMapper) {
        this.customObjectMapper = customObjectMapper;
        this.quizDao = quizDao;
    }

    @Override
    public ApiResponse saveQuiz(String username, QuizDto quizDto) {

        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setStatus(Boolean.TRUE);
        apiResponse.setMsg(QuizConstant.SUCCESS);
        QuizEntity quizEntity = new QuizEntity();
        List<QuestionEntity> questions = new ArrayList<>();
        QuestionEntity questionEntity = new QuestionEntity();

        quizDto.getQuestions().stream().map(e -> {
            questionEntity.setQuestion(e.getQuestion());
            questionEntity.setOptions(customObjectMapper.convertOptionDtoToEntity(e.getOptions()));
            questionEntity.setActive(QuizConstantBoolean.TRUE);
            questionEntity.setCreatedBy(username);
            return questionEntity;
        }).toList();

        questions.add(questionEntity);
        quizEntity.setQuestions(questions);
        quizEntity.setCreatedAt(new Date());
        quizEntity.setUserId(quizDto.getUserId());
        QuizEntity quiz = quizDao.saveQuiz(quizEntity);
        apiResponse.setData(quiz);

        return apiResponse;
    }

    @Override
    public ApiResponse getQuizById(String quizId) {
        //List<QuestionEntity> questions = quizDao.findAllQuestions(level, subject);
        QuizEntity quiz = quizDao.findById(quizId);
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setData(quiz);
        apiResponse.setMsg(QuizConstant.SUCCESS);
        apiResponse.setStatus(Boolean.TRUE);

        return apiResponse;
    }

    @Deprecated
    @Override
    public ApiResponse saveQuestion(CreateQuestionDto createQuestionDto) {
        ApiResponse apiResponse = new ApiResponse();

        QuestionEntity questionEntity = new QuestionEntity();
        questionEntity.setQuestion(createQuestionDto.getQuestion());

        questionEntity.setOptions(customObjectMapper
                .convertOptionDtoToEntity(createQuestionDto
                        .getOptions()));
        questionEntity.setActive(createQuestionDto.getActive());
        questionEntity = quizDao.saveQuestion(questionEntity);

        apiResponse.setData(questionEntity);
        apiResponse.setStatus(Boolean.TRUE);
        apiResponse.setMsg(QuizConstant.SUCCESS);

        return apiResponse;
    }

    @Override
    public ApiResponse processQuizReport(String quizId, QuizAttainedDto quizAttainedDto) {
        ApiResponse apiResponse = new ApiResponse();
        QuizEntity quizEntity = quizDao.findById(quizId);
        QuizAttainedEntity quizAttainedEntity = new QuizAttainedEntity();

        apiResponse.setMsg(QuizConstant.SUCCESS);
        apiResponse.setStatus(QuizConstant.TRUE);
        apiResponse.setData(quizAttainedEntity);

        return apiResponse;
    }

}
