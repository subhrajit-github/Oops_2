package com.Innerclass;

class A{
	static int i=10;
	int j=20;
	static class B{
		A a=new A();
		public void m1() {
			System.out.println(i);
			//System.out.println(j);//CTE
			System.out.println(a.j);
		}
	}
}

public class Test {

	public static void main(String[] args) {
		A.B b=new A.B();
		b.m1();
		
	}

}
