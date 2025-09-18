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
@CrossOrigin("http://localhost:4200")
@RequestMapping("/api/v1/quiz")
public class QuizSalesManController {

    @Autowired
    private QuizQuestionService quizQuestionService;

    @PostMapping
    public ResponseEntity<?> createQuiz(@RequestBody QuizDto quizDto) {
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping("/question")
    public ResponseEntity<?> saveQuestion(@RequestBody CreateQuestionDto createQuestionDto) {
        ApiResponse apiResponse = quizQuestionService.saveQuestion(createQuestionDto);
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }

    @GetMapping("/level/{level}/subject/{subject}")
    public ResponseEntity<ApiResponse> getAllQuestions(@PathVariable String level,
                                                       @PathVariable String subject) {
        return new ResponseEntity<>(quizQuestionService.getAllQuestions(level, subject), HttpStatus.OK);
    }
}
