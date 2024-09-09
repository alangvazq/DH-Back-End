package com.repaso.estudiantes;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GloblalExceptionHandler {

    private static final Logger logger = Logger.getLogger(GloblalExceptionHandler.class);

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> todosErrores(Exception ex, WebRequest req) {
        logger.error("Error: " + ex.getMessage());
        return new ResponseEntity("Error: " + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
