package com.MultiThreading;

class MyThread extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("My thread :"+i);
		}
	}
}

public class Demo1 {

	public static void main(String[] args) {
		MyThread t=new MyThread();//new thread created
		t.start();
		//t.start();//IllegalThreadStateException
		for(int i=1;i<=5;i++) {
			System.out.println("Main :"+i);
		}
	}

}
