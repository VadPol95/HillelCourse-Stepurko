package com.template.controller;

import com.template.exceptions.AmountNotFoundException;
import com.template.exceptions.NonUniqueUser;
import com.template.exceptions.NotEnoughtMoneyException;
import com.template.exceptions.UserNotFoundException;
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

    @ExceptionHandler(value = {
            UserNotFoundException.class})
    public ResponseEntity<?> handleUserNotFoundException(Exception ex) {
        return new ResponseEntity("Пользователя нет в системе", HttpStatus.BAD_REQUEST);

    }

    @ExceptionHandler(value = {
            AmountNotFoundException.class})
    public ResponseEntity<?> handleAmountNotFoundException(Exception ex) {
        return new ResponseEntity("Вы ввели не корректные данные ....", HttpStatus.BAD_REQUEST);

    }

    @ExceptionHandler(value = {
            NotEnoughtMoneyException.class})
    public ResponseEntity<?> handleMoneyException(Exception ex) {
        return new ResponseEntity("Денег нет, но вы держитесь ....", HttpStatus.BAD_REQUEST);

    }
}
