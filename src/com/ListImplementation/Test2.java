package com.ListImplementation;

public class Test2 {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		System.out.println((l));
		l.remove(2);
		System.out.println("After removing");
		System.out.println(l);
	}

}
