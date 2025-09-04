package com.Polymorphism;
//fuctionalInterface
interface sim{
	void connect();
}
class phone{
	sim s;//Has-a relationship
	public phone(sim s) {
		this.s=s;
	}
	public void call() {
		s.connect();
	}
	
}
class Airtel implements sim{
	//override
	public void connect() {
		System.out.println("Call connected by Airtel");
	}
}
class Jio implements sim{
	//override
	public void connect() {
		System.out.println("Call connected by Jio");
	}
}
class VI implements sim{
	//override
	public void connect() {
		System.out.println("Call connected by VI");
	}
}
public class PhoneDriver {

	public static void main(String[] args) {
		phone p1=new phone(new VI());
		phone p2=new phone(new Airtel());
		phone p3=new phone(new Jio());
		p1.call();
		p2.call();
		p3.call();

	}

}
