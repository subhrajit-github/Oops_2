package com.ExceptionHandling;

public class Test7 {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		try {
			System.out.println("Outer-try-block");
			try {
				System.out.println("Inner-try-block");
				System.out.println(a[1] / 0);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Inner-catch-block");
			}
		} catch (ArithmeticException e) {
			System.out.println("Outer-catch-block");
		}
	}

}
