package com.isobar.project.advices;

import com.isobar.project.exceptions.*;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class BandNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(BandNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String bandNotFoundHandler(BandNotFoundException ex) {
        return ex.getMessage();
    }
}