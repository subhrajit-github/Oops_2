package com.Java_8;

interface I4{
	boolean isEven(int i);
}

public class Test4 {

	public static void main(String[] args) {
		I4 i4=i->i%2==0;
		System.out.println(i4.isEven(40));
		System.out.println(i4.isEven(3));
	}

}
