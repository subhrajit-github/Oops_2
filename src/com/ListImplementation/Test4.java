package com.ListImplementation;

public class Test4 {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		System.out.println(l);
		l.add(3, 70);
		l.add(4,60);
		System.out.println(l);
		l.remove(1);
		System.out.println(l);
		l.reverse();
		System.out.println(l);
	}

}
