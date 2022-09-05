package com.template.controller;

import com.template.exceptions.NonUniqueUser;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(value = {
            Exception.class})
    public ResponseEntity<?> handleInvalidTopUpTypeException(Exception ex) {
        return new ResponseEntity(ex.getMessage(), HttpStatus.BAD_REQUEST);

    }

    @ExceptionHandler(value = {
            NonUniqueUser.class})
    public ResponseEntity<?> handleNonUniqueUserException(Exception ex) {
        return new ResponseEntity("Пользователь с таким именем уже есть в системе", HttpStatus.BAD_REQUEST);

    }
}
