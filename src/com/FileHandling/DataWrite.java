package com.FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class DataWrite {

	public static void main(String[] args) throws IOException {
		FileOutputStream f=new FileOutputStream("C:\\Users\\HP\\OneDrive\\FileHandling\\A.text");
		String s="Save the class";
		byte[] b=s.getBytes();
		f.write(b);
		f.close();
	}

}
