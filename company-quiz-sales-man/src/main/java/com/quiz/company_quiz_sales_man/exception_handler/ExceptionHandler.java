package com.quiz.company_quiz_sales_man.exception_handler;

import com.quiz.company_quiz_sales_man.constant.QuizConstant;
import com.quiz.company_quiz_sales_man.dto.ApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.awt.geom.RectangularShape;
import java.util.NoSuchElementException;

import static com.quiz.company_quiz_sales_man.constant.QuizConstant.FAILED;
import static com.quiz.company_quiz_sales_man.constant.QuizConstant.NOT_FOUND;

@ControllerAdvice
public class ExceptionHandler {

    private Logger logger = LoggerFactory.getLogger(ExceptionHandler.class);

    @org.springframework.web.bind.annotation.ExceptionHandler
    public ResponseEntity<?> handleException(Exception exception) {
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setStatus(Boolean.FALSE);
        apiResponse.setMsg("Something went wrong.");
        logger.info("Exception has occurred " + exception.getMessage());

        if (exception instanceof NullPointerException) {
            logger.error(exception.getClass().getName(), exception);

            apiResponse.setMsg(FAILED);
            apiResponse.setStatus(Boolean.FALSE);
            return new ResponseEntity<>(apiResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        if (exception instanceof HttpMessageNotReadableException) {
            apiResponse.setMsg(FAILED);
            apiResponse.setStatus(Boolean.FALSE);
            apiResponse.setMsg(exception.getLocalizedMessage());
            return new ResponseEntity<>(apiResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        if (exception instanceof HttpRequestMethodNotSupportedException) {
            apiResponse.setMsg(FAILED);
            apiResponse.setStatus(Boolean.FALSE);
            apiResponse.setMsg(exception.getLocalizedMessage());
            return new ResponseEntity<>(apiResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        if (exception instanceof NoSuchElementException) {
            apiResponse.setStatus(QuizConstant.FALSE);
            apiResponse.setMsg(NOT_FOUND);
            return new ResponseEntity<>(apiResponse, HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(apiResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
