package com.SingleTonClass;

public class Test {

	public static void main(String[] args) {
		//A a=new A();//Compile time error
		A a1=A.get();
		A a2=A.get();
		System.out.println(a1);
		System.out.println(a2);
	}

}
