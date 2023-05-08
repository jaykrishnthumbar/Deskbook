package com.onerivet.DeskBook.exception;

public class ResourceNotFound extends RuntimeException{
	
	private String message;
	
	public ResourceNotFound (String message) {
		super (message);
	}

}
