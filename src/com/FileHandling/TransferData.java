package com.FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TransferData {

	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\HP\\OneDrive\\Desktop\\Core-Java\\Basics\\A.java");
		FileOutputStream f1=new FileOutputStream("C:\\Users\\HP\\OneDrive\\FileHandling\\A.text");
		FileInputStream f=new FileInputStream(file);
		if(file.canRead()) {
			int n=f.read();
			while(n!=-1) {
				f1.write(n);
				n=f.read();
			}
		}else {
			System.out.println("can;t read :(");
			f.close();
			f1.close();
		}
	}

}
