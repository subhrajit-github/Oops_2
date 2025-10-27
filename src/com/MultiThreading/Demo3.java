package com.MultiThreading;

public class Demo3 {

	public static void main(String[] args) {
		String s = "I Love Java";
		for (int i = 0; i <= s.length()-1; i++) {
			System.out.println(s.charAt(i));
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
