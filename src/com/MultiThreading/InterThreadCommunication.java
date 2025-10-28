package com.MultiThreading;

class Bank {
	int bal;

	public Bank(int bal) {
		this.bal = bal;
	}

	public synchronized void withdraw(int amount) {
		if (amount > bal) {
			System.out.println("Insufficient bal....");
			System.out.println("Thread is waiting....");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		bal -= amount;
		System.out.println(amount + " is withdraw done");
		System.out.println(bal + " is available bal");
	}

	public synchronized void deposit(int amount) {
		System.out.println("Going to deposit");
		bal += amount;
		notify();
		System.out.println("Deposit completed");
	}
}

public class InterThreadCommunication {

	public static void main(String[] args) {
		Bank b = new Bank(1000);
		new Thread() {
			public void run() {
				b.withdraw(2000);
			}
		}.start();
		new Thread() {
			public void run() {
				b.deposit(3000);
			}
		}.start();
	}

}
