package com.MultiThreading;

class T1 implements Runnable{
	public void run() {
		for(char ch='A'; ch<='J'; ch++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
			System.out.println(ch);;
		}
	}
}

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		T1 t1=new T1();
		//t1.start();//CTE
		Thread t=new Thread(t1);
		t.start();
		for(int i=1; i<=10; i++) {
			Thread.sleep(500);
			System.out.println(i);
		}
	}

}
