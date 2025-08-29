package com.Interface;
interface I5{
	void m1();
}
interface I6{
	void m2();
}
abstract class A{
	public abstract void m3();
}
class D extends A implements I5,I6{
	//override
	public void m2() {
		System.out.println("m2()-B");
	}
	public void m1() {
		System.out.println("m1()-B");
	}
	public void m3() {
		System.out.println("m3()-B");
	}
	public void m4() {
		System.out.println("m4()-B");
	}
}
public class Test5 {
public static void main(String [] args) {
	I5 i=new D();
	i.m1();
	//i.m2();//compile time error
	D b=(D)i;
	b.m2();
	b.m3();
	b.m4();
}
}
