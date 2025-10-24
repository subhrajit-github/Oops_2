package com.ExceptionHandling;

public class Test9 {

	public static void main(String[] args) {
		System.out.println("main starts");
		m1();
		System.out.println("main ends");
	}
	public static void m1() {
		System.out.println("m1() starts");
		m2();
		System.out.println("m1() ends");
	}
	public static void m2() {
		System.out.println("m2() starts");
		try {
			System.out.println(10/0);
		}catch(ArithmeticException e) {
			System.out.println("handled");
		}
		System.out.println("m2() ends");
	}

}
