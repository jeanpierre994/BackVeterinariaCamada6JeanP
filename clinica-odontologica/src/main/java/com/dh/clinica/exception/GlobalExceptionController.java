package com.dh.clinica.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionController {
    @ExceptionHandler(ResourceNotFoundException.class)
    public String processResourceNotFound(ResourceNotFoundException resourceNotFoundException) {
        return resourceNotFoundException.getMessage();
    }



}
