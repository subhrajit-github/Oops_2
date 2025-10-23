package com.ExceptionHandling;

public class Test2 {

	public static void main(String[] args) {
		System.out.println("Main starts");
		int[] a = { 5, 4, 7, 8 };
		try {
			System.out.println(a[4] / 0);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic-catch-block");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds-catch-block");
		}
		System.out.println("Main ends");
	}

}
