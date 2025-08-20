package com.downCasting;
  class A{
	  
  }
  class B extends A{
	  
  }
  class C extends A{
	  
  }
public class Demo1 {
   public static void main(String [] args) {
	   A a1=new B();
	   B b1=(B)a1;//no error at compile time
	              //It works at run time
	   
	   C c1=(C)a1;//no error at compile time
	              //throws ClassCastException at runtime
	              //at runtime a1 contains instance of B type
	              //B type cannot cast to C type
   }
}
