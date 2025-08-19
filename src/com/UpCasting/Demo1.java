package com.UpCasting;
class A{
	void m1() {
		System.out.println("m1 in A");
	}
}
class B extends A{
	void m1() {
		System.out.println("m1 in B");
	}
}
class C extends A{
	void m1() {
		System.out.println("m1 in C");
	}
}
public class Demo1 {
     public static void main(String [] args) {
    	 A a1=new B();
    	 a1.m1();
    	 A a2=new C();
    	 a2.m1();
     }
}
