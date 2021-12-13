package com.chancetop.automation.common.handlers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandlers {
    Logger logger = LoggerFactory.getLogger(GlobalExceptionHandlers.class);


    @ExceptionHandler(Exception.class)
    public GlobalResultHandler exceptionHandler(Exception e) {
        logger.error(e.getMessage());
        e.printStackTrace();
        return GlobalResultHandler.error("服务器异常：" + e.getMessage());
    }
}
