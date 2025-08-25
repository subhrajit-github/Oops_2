package com.Interface;
  interface I3{
	  void m1();
  }
  interface I4 extends I3{
	  void m2();
  }
  class C implements I4{
	  //Override
	  public void m1() {
		  System.out.println("m1()-B");
	  }
	  public void m2() {
		  System.out.println("m2()-B");
	  }
  }
public class Test3 {

	public static void main(String[] args) {
		I3 i1=new C();
		i1.m1();
		//i1.m2();//compile time error
		I4 i2=new C();
		i2.m1();
		i2.m2();
	}

}
