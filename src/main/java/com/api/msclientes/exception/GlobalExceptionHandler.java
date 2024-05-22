package com.api.msclientes.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

  @ResponseStatus(HttpStatus.BAD_REQUEST)
  @ExceptionHandler(MethodArgumentNotValidException.class)
  public ResponseEntity<?> handleValidationExceptions(MethodArgumentNotValidException ex, HttpServletRequest request) {
    Map<String, String> errors = new HashMap<>();
    ex.getBindingResult().getAllErrors().forEach((error) -> {
      String fieldName = ((FieldError) error).getField();
      String errorMessage = error.getDefaultMessage();
      errors.put(fieldName, errorMessage);
    });


    ApiError response = ApiError.builder()
            .timestamp(LocalDateTime.now())
            .path(request.getRequestURI())
            .errors(errors)
            .build();

    return new ResponseEntity(response, HttpStatus.BAD_REQUEST);
  }


  @ResponseStatus(HttpStatus.NOT_FOUND)
  @ExceptionHandler(NoHandlerFoundException.class)
  public ResponseEntity<?> handleNotFound(NoHandlerFoundException ex, HttpServletRequest request) {
    ApiError response = ApiError.builder()
            .timestamp(LocalDateTime.now())
            .path(request.getRequestURI())
            .errors("Ruta no encontrada")
            .build();
    return new ResponseEntity(response, HttpStatus.NOT_FOUND);
  }
}
