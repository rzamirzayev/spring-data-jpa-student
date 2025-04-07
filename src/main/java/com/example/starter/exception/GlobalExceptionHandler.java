package com.example.starter.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.*;

@ControllerAdvice
public class GlobalExceptionHandler {
    private List<String> addMapValue(List<String> list,String newValue){
        list.add(newValue);
        return list;
    }

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public ResponseEntity<ApiError> handleMethodArgumentNotValid(MethodArgumentNotValidException ex){
        Map<String, List<String >> errors = new HashMap<>();
        for(ObjectError objError : ex.getBindingResult().getAllErrors()){
            String fieldName=((FieldError)objError).getField();
            if(errors.containsKey(fieldName)){
                errors.put(fieldName,addMapValue(errors.get(fieldName),objError.getDefaultMessage()));
            }else{
                errors.put(fieldName,addMapValue(new ArrayList<>(),objError.getDefaultMessage()));
            }
        }
        return ResponseEntity.badRequest().body(createApiError(errors));
    }


    private <T> ApiError<T> createApiError(T errors){
        ApiError<T> apiError = new ApiError<T>();
        apiError.setId(UUID.randomUUID().toString());
        apiError.setErrorTime(new Date());
        apiError.setErrors(errors);
        return apiError;
    }
}
