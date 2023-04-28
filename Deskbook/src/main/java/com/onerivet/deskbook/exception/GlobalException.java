package com.onerivet.deskbook.exception;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.onerivet.deskbook.entity.Response1;

@RestControllerAdvice
public class GlobalException extends RuntimeException{
	
	@ExceptionHandler(ResourceNotFound.class)
	public Response1 resourceNotFoundHandler(ResourceNotFound exc) {
		
		String message = exc.getMessage();
		LocalDateTime now = LocalDateTime.now();
		Response1 res = new Response1(message, now);
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
