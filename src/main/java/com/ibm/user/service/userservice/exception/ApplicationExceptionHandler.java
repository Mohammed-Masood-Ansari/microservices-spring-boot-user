package com.ibm.user.service.userservice.exception;

import com.ibm.user.service.userservice.response.ResponseStructure;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * this class will generate global exception for this application and applicable for all classes
 * @author Mo Masood Ansari
 */
@RestControllerAdvice
public class ApplicationExceptionHandler {

    @ExceptionHandler(UserResourceNotFoundException.class)
    public ResponseEntity<ResponseStructure> applicationExceptionHandler(UserResourceNotFoundException exception){
            String message=exception.getMessage();
            ResponseStructure structure=ResponseStructure.builder().msg(message).success(true).httpStatus(HttpStatus.NOT_FOUND).build();
            return new ResponseEntity<ResponseStructure>(structure, HttpStatus.NOT_FOUND);
    }

}
