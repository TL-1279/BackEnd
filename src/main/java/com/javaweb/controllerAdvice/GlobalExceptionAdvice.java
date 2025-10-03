package com.javaweb.controllerAdvice;

import org.springframework.web.bind.annotation.ExceptionHandler;

import com.javaweb.model.reponse.ErrorResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


public class GlobalExceptionAdvice {
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse>handlerException (Exception ex){
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setError("Invalid Data Building");
		errorResponse.setError(ex.getMessage());
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
	}
	

}
