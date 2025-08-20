package com.Overriding;
  class A{
	  void m1() {
		  System.out.println("m1() implemented in A");
	  }
  }
  class B extends A{
	  void m1() {
		  System.out.println("m1() implemented in B");
	  }
  }
public class Test1 {
    public static void main(String [] args) {
    	B b1=new B();
    	b1.m1();
    }
}
