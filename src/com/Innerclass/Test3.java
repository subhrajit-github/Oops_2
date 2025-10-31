package com.Innerclass;

public class Test3 {

	public static void main(String[] args) {
		class A{  //Method local InnerClass
			public void add(int a, int b) {
				System.out.println(a+b);
			}
		}
		A a=new A();
		a.add(10, 20);
	}

}
