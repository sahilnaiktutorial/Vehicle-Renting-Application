package com.jsp.vra.exceptionhandler;

import com.jsp.vra.exception.UserNotFoundByIdException;
import com.jsp.vra.utility.ErrorStructure;
import com.jsp.vra.utility.RestResponseBuilder;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@AllArgsConstructor
public class UserExceptionHandler {

    private final RestResponseBuilder restResponseBuilder;

    @ExceptionHandler(UserNotFoundByIdException.class)
    public  ResponseEntity<ErrorStructure<String>> handleUserNotFound(UserNotFoundByIdException ex){
        return restResponseBuilder.error(HttpStatus.NOT_FOUND,ex.getMessage(),"user not found");
    }

}
