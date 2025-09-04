package com.Interface;
interface I9{
	void m1();
	default void m2() {
		System.out.println("m2()-I9");
	}
}
class Z implements I9{
	public void m1() {
		System.out.println("m1()-Z");
	}
}

public class Test7 {

	public static void main(String[] args) {
		I9 i9=new Z();
        i9.m1();
        i9.m2();
	}

}
