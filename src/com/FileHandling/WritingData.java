package com.FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingData {

	public static void main(String[] args) throws IOException {
		FileWriter f=new FileWriter("C:\\Users\\HP\\OneDrive\\FileHandling\\c.txt");
		try(BufferedWriter bf=new BufferedWriter(f)){
				bf.write("Jspiders");
				bf.newLine();
				bf.write("Qspiders");
		}
	}

}
