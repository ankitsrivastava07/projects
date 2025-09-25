package com.quiz.company_quiz_sales_man.controller;

import com.quiz.company_quiz_sales_man.dto.ApiResponse;
import com.quiz.company_quiz_sales_man.dto.CreateQuestionDto;
import com.quiz.company_quiz_sales_man.dto.QuizDto;
import com.quiz.company_quiz_sales_man.service.QuizQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/quiz")
public class QuizSalesManController {

    @Autowired
    private QuizQuestionService quizQuestionService;

    @PostMapping
    public ResponseEntity<?> createQuiz(@RequestHeader String userName, @RequestBody QuizDto quizDto) {
        ApiResponse apiResponse = quizQuestionService.saveQuiz(userName, quizDto);
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }

   /* @PostMapping("/question")
    public ResponseEntity<?> saveQuestion(@RequestBody CreateQuestionDto createQuestionDto) {
        ApiResponse apiResponse = quizQuestionService.saveQuestion(createQuestionDto);
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }*/

    @GetMapping("/{quizId}")
    public ResponseEntity<ApiResponse> getQuizById(@PathVariable String quizId) {
        return new ResponseEntity<>(quizQuestionService.getQuizById(quizId), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAllQuizs() {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
