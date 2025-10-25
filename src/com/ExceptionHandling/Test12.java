package com.ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test12 {

	public static void main(String[] args) {
		System.out.println("main starts");
		try {
			m1();
		}
		catch(Exception e) {
			System.out.println("handled");
		}
		System.out.println("main ends");
	}
		public static void m1() throws Exception{
			m2();
		}
		public static void m2() throws FileNotFoundException,IOException{
			FileReader r=new FileReader("C:\\Users\\HP\\OneDrive\\Desktop\\Practise java\\ArmStrongNum");
			System.out.println("Reading the data");
			FileWriter w=new FileWriter("C:\\Users\\HP\\OneDrive\\Desktop\\Practise java\\ArmStrongNum");
			System.out.println("Writer");
		
	}

}
