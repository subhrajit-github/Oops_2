package com.ExceptionHandling;

public class Test10 {

	public static void main(String[] args) {
		try {
			String s=null;
			System.out.println(s.length()/0);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic-catch-block");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndex-catch-block");
		}
		catch(Exception e) {
			System.out.println("Exception-catch-block");
		}
		//catch(NullPointerException e) {
			//System.out.println("NullPointer-catch-block");
			//Unreachable catch block for NullPointerException. 
			//It is already handled by the catch block for Exception
		//}
	}

}
