package com.tech.departmentservice.exception;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice

public class GlobalExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<?> departmentNotFoundException(DepartmentNotFoundException exception, WebRequest webRequest){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
