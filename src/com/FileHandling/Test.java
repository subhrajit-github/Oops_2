package com.FileHandling;

import java.io.File;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\HP\\OneDrive\\FileHandling\\A.text");
		//System.out.println(f.mkdir());//Folder is created
		System.out.println(f.createNewFile());//File is created
		System.out.println(f.canExecute());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.getAbsolutePath());
		
		//File f1=new File("C:\\Users\\HP\\OneDrive\\FileHandling\\B.text");
		//System.out.println(f.renameTo(f1));//File is renamed
	}

}
