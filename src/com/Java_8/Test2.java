package com.Java_8;

interface I2{
	void m2(String s1, String s2);
}

public class Test2 {

	public static void main(String[] args) {
		I2 i2=(s1, s2)->{
			System.out.println(s1.toUpperCase()+" "+s1.length());
			System.out.println(s2.toLowerCase()+" "+s2.length());
		};
		i2.m2("Ram", "Sita");
	}

}
