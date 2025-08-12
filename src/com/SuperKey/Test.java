package com.SuperKey;
class AA{
	static int i=10;
	int j=20;
}
class BB extends AA{
	static int i=30;
	int j=40;
	public void m1() {
		System.out.println(i+" "+j);
		System.out.println(super.i+" "+super.j);
	}
	public void m2() {
		System.out.println(i);
	}
}
public class Test {
     public static void main(String [] args) {
    	 BB b=new BB();
    	 b.m1();
    	 b.m2();
     }
}
