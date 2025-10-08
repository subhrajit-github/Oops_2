package com.QueueImplementation;

public class Test2 {

	public static void main(String[] args) {
		LinkedListQueue l=new LinkedListQueue();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		System.out.println(l.poll());
		System.out.println(l.poll());
	}

}
