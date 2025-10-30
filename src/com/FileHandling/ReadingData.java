package com.FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingData {

	public static void main(String[] args) throws IOException {
		FileReader f=new FileReader("C:\\Users\\HP\\OneDrive\\Desktop\\Core-Java\\Basics\\A.java");
		try(BufferedReader bf= new BufferedReader(f)){
			String s=bf.readLine();
			while(s!=null) {
				System.out.println(s);
				s=bf.readLine();
			}
		}
	}

}
