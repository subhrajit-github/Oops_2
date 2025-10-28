package com.MultiThreading;

class A {
	public synchronized void m1(String s) {
		for (int i = 1; i <= 10; i++) {
			System.out.println("m1 executed by :" + s);
		}
	}
}

class Threads extends Thread {
	A a;
	String s;

	public Threads(A a, String s) {
		this.a = a;
		this.s = s;
	}

	public void run() {
		a.m1(s);
	}
}

public class Demo7 {

	public static void main(String[] args) {
		A a = new A();
		Threads t1 = new Threads(a, "T1");
		Threads t2 = new Threads(a, "T2");
		t1.start();
		t2.start();
	}

}
