package com.Abstraction_2;
interface I1{
	int i=10;//public static final int i=10;
	void m1();//public abstract void m1();
}
public class Test {
   public static void main(String [] args) {
	   //I1 i=new I1();//Compile time error
	   System.out.println(I1.i);
   }
}
