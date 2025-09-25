package com.quiz.company_quiz_sales_man.controller;

import com.quiz.company_quiz_sales_man.dto.ApiResponse;
import com.quiz.company_quiz_sales_man.dto.QuizAttainedDto;
import com.quiz.company_quiz_sales_man.service.QuizProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/quiz/{quizId}/attain")
public class QuizProcessController {

    @Autowired
    private QuizProcessService quizProcessService;

    @PostMapping
    public ResponseEntity<?> saveAttainedQuestion() {
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PatchMapping
    public ResponseEntity<?> processQuizReport(@PathVariable String quizId, @RequestBody QuizAttainedDto quizAttainedDto) {
        ApiResponse apiResponse = quizProcessService.processQuizAttained(quizId, quizAttainedDto);
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }
}
