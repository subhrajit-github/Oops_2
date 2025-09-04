package com.Interface;
interface I10{
	void m1();
	default void m2() {
		System.out.println("m2()-I10");
	}
	static void m3() {
		System.out.println("m3()-I10");
		m4();
	}
	private static void m4() {
		System.out.println("private-m4()");
	}
}
class J implements I10{
	public void m1() {
		System.out.println("m1()-J");
	}
	public void m2() {
		System.out.println("m2()-J");
	}
}
public class Test8 {

	public static void main(String[] args) {
		I10 i10=new J();
		i10.m1();
		i10.m2();
		I10.m3();

	}

}
