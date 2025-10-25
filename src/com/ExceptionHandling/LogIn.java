package com.ExceptionHandling;

public class LogIn {
public static void main(String [] args) {
	String user = "Ram";
	int password=1234;
	  if(user.equals("Ram")){
		if (password == 1234) {
			System.out.println("LogIn done.....");
		}
		else {
			throw new InvalidPasswordException();
		}
	}
	  else
	{
		throw new InvalidUserNameException();
	}

}}
