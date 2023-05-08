package com.onerivet.DeskBook.exception;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.onerivet.DeskBook.model.dtos.Responces;

@RestControllerAdvice
public class GlobalExceptionHandler extends RuntimeException{
	
	@ExceptionHandler(ResourceNotFound.class)
	public Responces resourceNotFoundHandler(ResourceNotFound excp) {
		
		String message = excp.getMessage();
		LocalDateTime now = LocalDateTime.now();
		Responces res = new Responces(message, now);
		return res;
		
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> method(MethodArgumentNotValidException excp){
		Map<String, String> responce = new HashMap<String, String>();
		excp.getBindingResult().getAllErrors().forEach(error -> {
			String fieldName = ((FieldError) error).getField();
			String message = error.getDefaultMessage();
			responce.put(fieldName, message);
			
		});
		return responce;
		
	}
	
	

}
