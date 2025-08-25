package com.AbstractMethod;
 abstract class X{
	 abstract public void m1();
 }
 class Y extends X{
	 public void m1() {
		 System.out.println("m1()-Y");
		 }
 }
public class Demo {
    public static void main(String [] args) {
    	//A a =new A();//Compile time Error
    	X x=new Y();
    	x.m1();
    }
}
