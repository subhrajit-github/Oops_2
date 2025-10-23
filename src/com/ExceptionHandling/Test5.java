package com.ExceptionHandling;

public class Test5 {

	public static void main(String[] args) {
		System.out.println("Main starts");
		int[] a = { 5, 4, 7, 8 };
		try {
			System.out.println(a[20] / 0);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("handled");
		}
		System.out.println("Main ends");
	}

}
