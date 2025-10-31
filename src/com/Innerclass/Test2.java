package com.Innerclass;

class C{
	static int i=10;
	int j=20;
	final int k=30;
	private static int l=40;
	class D{
		int i=50;
		public void m1() {
			System.out.println(A.i+"\n"+j+"\n"+k+"\n"+l);
		}
	}
}

public class Test2 {

	public static void main(String[] args) {
		C c=new C();
		C.D d=c.new D();
		d.m1();
		System.out.println(new C().new D().i);
	}

}
