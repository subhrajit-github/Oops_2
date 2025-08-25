package com.Interface;
interface I2{
	int i=10;
	void m1();
}
 class B implements I2{
	int i=20;
	//Override
	public void m1() {
		System.out.println("m1()-B");
	}
}
public class Test1 {
    public static void main(String []args) {
    	I2 i2=new B();
    	System.out.println(i2.i);
    	i2.m1();
    }
}
