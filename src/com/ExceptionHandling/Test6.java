package com.ExceptionHandling;

public class Test6 {

	public static void main(String[] args) {
		String s="24F";
		try {
			System.out.println(Integer.parseInt(s));//NumberFormatException e=new NumberFormatException;
			System.out.println("try-block");
		}catch(NumberFormatException e) {
			System.out.println("Handled...");
		}
	}

}
