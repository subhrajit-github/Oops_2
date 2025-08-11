package com.Is_A;
class A{
	int i=10;
}
class B extends A{
	int j=20;
}
public class Test {
     public static void main(String [] args) {
    	 A a=new A();
    	 System.out.println(a.i);
    	// System.out.println(a.j);//Compile time Error
    	 B b=new B();
    	 System.out.println(b.i);
    	 System.out.println(b.j);
     }
}
