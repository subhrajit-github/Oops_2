package com.ListImplementation;

public class Test4 {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		for(int i=0;i<l.size();i++) {
			System.out.println((Integer)l.get(i));
		}
	}

}
