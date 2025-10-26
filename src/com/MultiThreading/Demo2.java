package com.MultiThreading;

class MyThread_1 extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("MyThread_1 :" + i);
		}
	}
}

class MyThread_2 extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("MyThread_2 :" + i);
		}
	}
}

public class Demo2 {

	public static void main(String[] args) {
		MyThread_1 t1 = new MyThread_1();
		MyThread_2 t2 = new MyThread_2();
		t1.setPriority(9);
		t1.start();
		t2.start();
	}

}
