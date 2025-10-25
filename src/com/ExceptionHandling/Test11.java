package com.ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test11 {

	public static void main(String[] args) {
		System.out.println("main starts");
		try {
			FileReader f=new FileReader("C:\\Users\\HP\\OneDrive\\Desktop\\Practise java\\ArmStrongNum");
			System.out.println("Reading the data");
		}
		catch(FileNotFoundException e) {
			System.out.println("Handling");
		}
		System.out.println("main ends");
	}

}
