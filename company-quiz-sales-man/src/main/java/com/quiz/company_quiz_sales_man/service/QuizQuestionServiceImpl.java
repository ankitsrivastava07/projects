package com.quiz.company_quiz_sales_man.service;

import com.quiz.company_quiz_sales_man.constant.QuizConstant;
import com.quiz.company_quiz_sales_man.constant.QuizConstantBoolean;
import com.quiz.company_quiz_sales_man.dao.QuizQuestionDao;
import com.quiz.company_quiz_sales_man.dto.ApiResponse;
import com.quiz.company_quiz_sales_man.dto.CreateQuestionDto;
import com.quiz.company_quiz_sales_man.dto.QuizDto;
import com.quiz.company_quiz_sales_man.entity.QuestionEntity;
import com.quiz.company_quiz_sales_man.entity.QuizEntity;
import com.quiz.company_quiz_sales_man.mapper.CustomObjectMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class QuizQuestionServiceImpl implements QuizQuestionService {

    private final CustomObjectMapper customObjectMapper;
    private final QuizQuestionDao quizQuestionDao;

    public QuizQuestionServiceImpl(QuizQuestionDao quizQuestionDao,
                                   CustomObjectMapper customObjectMapper) {
        this.customObjectMapper = customObjectMapper;
        this.quizQuestionDao = quizQuestionDao;
    }

    @Override
    public ApiResponse saveQuiz(QuizDto quizDto) {

        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setStatus(Boolean.TRUE);
        apiResponse.setMsg("Success");
        QuizEntity quizEntity = new QuizEntity();
        List<QuestionEntity> questions = new ArrayList<>();
        QuestionEntity questionEntity = new QuestionEntity();

        quizDto.getQuestions().stream().map(e -> {
            questionEntity.setQuestion(e.getQuestion());
            questionEntity.setOptions(customObjectMapper.convertOptionDtoToEntity(e.getOptions()));
            questionEntity.setActive(QuizConstantBoolean.TRUE);
            questionEntity.setAnswers(customObjectMapper.convertAnswerDtoTOEntity(e.getAnswers()));
            return questionEntity;
        }).toList();
        questions.add(questionEntity);
        quizEntity.setQuestions(questions);
        quizEntity.setCreatedAt(new Date());
        quizEntity.setUserId(quizDto.getUserId());
        return apiResponse;
    }

    public ApiResponse getAllQuestions(String level, String subject) {
        List<QuestionEntity> questions = quizQuestionDao.findAllQuestions(level, subject);
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setData(questions);
        apiResponse.setMsg(QuizConstant.SUCCESS);
        apiResponse.setStatus(Boolean.TRUE);

        return apiResponse;
    }

    @Override
    public ApiResponse saveQuestion(CreateQuestionDto createQuestionDto) {
        ApiResponse apiResponse = new ApiResponse();

        QuestionEntity questionEntity = new QuestionEntity();
        questionEntity.setSubjectId(createQuestionDto.getSubjectId());
        questionEntity.setTopicId(createQuestionDto.getTopicId());
        questionEntity.setQuestion(createQuestionDto.getQuestion());
        questionEntity.setAnswers(customObjectMapper
                .convertAnswerDtoTOEntity(createQuestionDto
                        .getAnswers()));

        questionEntity.setOptions(customObjectMapper
                .convertOptionDtoToEntity(createQuestionDto
                        .getOptions()));
        questionEntity.setActive(createQuestionDto.getActive());
        questionEntity.setLevel(QuizConstant.QUIZ_LEVEL);
        questionEntity = quizQuestionDao.saveQuestion(questionEntity);

        apiResponse.setData(questionEntity);
        apiResponse.setStatus(Boolean.TRUE);
        apiResponse.setMsg(QuizConstant.SUCCESS);

        return apiResponse;
    }

}
