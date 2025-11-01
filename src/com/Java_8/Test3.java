package com.Java_8;

interface I3{
	int add(int a, int b);
}

public class Test3 {

	public static void main(String[] args) {
		I3 i3=(a, b)->a+b;
		System.out.println(i3.add(20, 30));
		System.out.println(i3.add(10, 20));
	}

}
