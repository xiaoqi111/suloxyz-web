package com.suloxyz.config;

import com.suloxyz.common.Result;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger logger = LogManager.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(Exception.class)
    public Result exceptionHandler(Exception e, HttpServletRequest request) {
        e.printStackTrace();
        return Result.expResult().setMsg(e.getMessage());
    }


}
