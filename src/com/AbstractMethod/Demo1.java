package com.AbstractMethod;
  abstract class A{
	  abstract public void m1();
	  abstract public void m2();
  }
  abstract class B extends A{
	  public void m1() {
		  System.out.println("m1()-B");
	  }
  }
  class C extends B{
	  public void m2() {
		  System.out.println("m2()-C");
	  }
  }
public class Demo1 {

	public static void main(String[] args) {
		//A a=new B();//Compile Time Error
		A a=new C();
		a.m1();
		a.m2();
	}

}
