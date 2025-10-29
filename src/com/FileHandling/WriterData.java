package com.FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterData {

	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\HP\\OneDrive\\FileHandling\\A.text");
		FileWriter f=new FileWriter(file);
		if(file.canWrite()) {
			f.write("Jspiders\n");
			f.write("Qspiders\n");
			f.write("Pyspiders\n");
			f.write("Prospiders\n");
			f.write("Gspiders\n");
			f.close();
		}else {
			System.out.println("can't write :(");
			f.close();
		}
	}

}
