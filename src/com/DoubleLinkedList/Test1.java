package com.DoubleLinkedList;

public class Test1 {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		//System.out.println(l);
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		System.out.println(l);
		l.add(2,60);
		l.add(3,70);
		System.out.println(l);
		l.remove(3);
		l.remove(4);
	    System.out.println(l);
		l.reverse();
		System.out.println(l);
	}

}
