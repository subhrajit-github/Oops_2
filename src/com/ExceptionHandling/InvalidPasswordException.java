package com.ExceptionHandling;

public class InvalidPasswordException extends RuntimeException {
	public InvalidPasswordException() {
		super("Password is wrong");
	}

}
