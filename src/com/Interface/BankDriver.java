package com.Interface;

import java.util.Scanner;

interface bank{
	void rateofInt();
	default void creditCard() {
		System.out.println("no-creditCard");
	}
	static void IFSC(bank o) {
		System.out.println(o.getClass().getSimpleName()+"IFSC code");
	}
	private static void info() {
		System.out.println("Bank info");
	}
}
class SBI implements bank {
	public void rateofInt() {
		System.out.println("SBI rate of Int is :10");
	}
	public void creditCard() {
		System.out.println("SBI credit card");
	}
	public void yono() {
		System.out.println("SBI-Yono");
	}
}
class ICICI implements bank{
	public void rateofInt() {
		System.out.println("ICICI rate of Int is :11");
	}
	public void creditCard() {
		System.out.println("ICICI credit card");
	}
	public void imobile() {
		System.out.println("ICICI-imobile");
	}
}
class AXIS implements bank{
	public void rateofInt() {
		System.out.println("AXIS rate of Int is :8");
	}
	
}
public class BankDriver {
public static bank getbank() {
	Scanner sc=new Scanner(System.in);
	System.out.println("1.SBI\n2.ICICI\n3.AXIS\n4.NONE");
	int n=sc.nextInt();
	if(n==1) 
		return new SBI();
	else if(n==2)
		return new ICICI();
	else if(n==3)
		return new AXIS();
	else {
		System.out.println("Invalid Input");
		return null;
	}
}
	public static void main(String[] args) {
    bank b=getbank();
    b.rateofInt();
    b.creditCard();
    if(b instanceof SBI) ((SBI)b).yono();
    else if(b instanceof ICICI) ((ICICI)b).imobile();
    bank.IFSC(b);
	}

}
