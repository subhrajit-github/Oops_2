package com.Java_8;

interface I1 {
	void m1(int i);
}

public class Test1 {
	public static void main(String[] args) {
		I1 i1 = i -> System.out.println("m1() :" + i);
		i1.m1(10);
		i1.m1(20);
	}

}
