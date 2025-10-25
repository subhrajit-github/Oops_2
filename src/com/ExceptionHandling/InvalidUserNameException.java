package com.ExceptionHandling;

public class InvalidUserNameException extends RuntimeException {

	public InvalidUserNameException() {
		super("UserName is wrong");
	}

}
