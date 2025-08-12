package com.SuperKey;
class A{
	int i=10;
}
class B extends A{
	int i=20;
	int j=30;
	public void display() {
		System.out.println(i);
		System.out.println(super.i);
		System.out.println(j);
	}
}
class C extends B{
	int i=40;
	int j=50;
	int k=60;
	public void display() {
		super.display();
		System.out.println(i+" "+j+" "+k);
		System.out.println(super.i+" "+super.j);
	}
}
public class Demo {
	public static void main(String [] args) {
		C c=new C();
		c.display();
	}

}
