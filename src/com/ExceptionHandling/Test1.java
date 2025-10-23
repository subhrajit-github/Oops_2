package com.ExceptionHandling;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("Main starts");
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			System.out.println("handled");
		}
		System.out.println("Main ends");
	}

}