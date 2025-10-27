package com.MultiThreading;

class T4 extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("T1 :"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Demo6 {

	public static void main(String[] args) throws InterruptedException {
	      T4 t4=new T4();
	      t4.setDaemon(true);//Non-Daemon to Daemon
	      t4.start();
	      for(int i=1; i<=10; i++) {
	    	  System.out.println("Main :"+i);
	    	  if(i==6) System.out.println(i/0);
	    	  Thread.sleep(500);
	      }
		
	}

}
