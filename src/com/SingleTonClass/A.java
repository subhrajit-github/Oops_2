package com.SingleTonClass;

public class A {
 static A a;
 private A() {
	 
 }
 public static A get() {
	 if(a==null) {
		 a=new A();
		 return a;
	 }
	 return a;
 }
}
