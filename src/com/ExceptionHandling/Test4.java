package com.ExceptionHandling;

public class Test4 {

	public static void main(String[] args) {
		System.out.println("Main starts");
		String s=null;
		try {
			System.out.println(s.length());
		}catch(NullPointerException e) {
			System.out.println("handled");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Main ends");
	}

}
