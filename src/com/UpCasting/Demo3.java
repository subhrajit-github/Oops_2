package com.UpCasting;
class P{
	static void m1() {
		System.out.println("static m1 in P");
	}
}
class Q extends P{
	static void m1() {
		System.out.println("static m1 in Q");
	}
}
class R extends P{
	static void m1() {
		System.out.println("static m1 in R");
	}
}
public class Demo3 {
      public static void main(String [] args) {
    	  P p1=new Q();
    	  p1.m1();
    	P  p2=new R();
    	  p1.m1();
      }
}
