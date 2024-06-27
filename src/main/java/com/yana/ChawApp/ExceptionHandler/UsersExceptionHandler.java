package com.yana.ChawApp.ExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.yana.ChawApp.NotFoundException.UsersNotFoundException;

@RestControllerAdvice
public class UsersExceptionHandler {

    @ExceptionHandler(UsersNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String UserNotFoundHandler(UsersNotFoundException e){
        return e.getMessage();
    }
}
