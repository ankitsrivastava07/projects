package com.quiz.company_quiz_sales_man.mapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.quiz.company_quiz_sales_man.dto.*;
import com.quiz.company_quiz_sales_man.entity.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CustomObjectMapper {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public QuestionEntity convertQuestionDtoToEntity(CreateQuestionDto createQuestionDto) {

     /*   QuestionEntity questionEntity = new QuestionEntity();
        questionEntity.setQuestion(createQuestionDto.getQuestion());
        questionEntity.setOptionEntities(createQuestionDto
                .getOptions()
                .stream()
                .map(e -> {
                    OptionEntity optionEntity = new OptionEntity();
                    optionEntity.setOpt(e.getOpt());
                    optionEntity.setUuid(UUID.randomUUID().toString());
                    return e;
                })).toList();*/
        return null;
    }

    public List<OptionEntity> convertOptionDtoToEntity(List<OptionDto> optionDto) {
        return optionDto
                .stream()
                .map(e -> objectMapper
                        .convertValue(e, OptionEntity.class))
                .toList();
    }

    public List<AnswerEntity> convertAnswerDtoTOEntity(List<AnswerDto> answers) {
        return answers.stream().map(e -> {
            AnswerEntity ans = new AnswerEntity();
            ans.setDescription(e.getDescription());
            ans.setComment(e.getComment());
            return ans;
        }).collect(Collectors.toList());
    }

    public List<SubjectEntity> convertSubjectDtoToEntity(List<SubjectDto> subjectDtos) {
        return subjectDtos.stream().map(e -> {
            SubjectEntity subject = new SubjectEntity();
            subject.setDescription(e.getDescription());
            subject.setName(e.getName());
            subject.setTitle(e.getTitle());
            return subject;
        }).toList();
    }
}
