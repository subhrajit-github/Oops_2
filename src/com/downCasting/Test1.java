package com.downCasting;
  class X{
	  void m1() {
		  
	  }
  }
  class Y extends X{
	  void m2() {
		  
	  }
  }
public class Test1 {
    public static void main(String [] args) {
    	X x1=new Y();
    	x1.m1();
    	//Y y1=x1;//Compile time Error
    	Y y1=(Y)x1;
    	y1.m2();
    	System.out.println("Done");
    }
}
