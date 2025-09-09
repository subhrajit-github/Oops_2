package com.Strings;

import java.util.Scanner;

public class Pallindrom {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		System.out.println("The String is "+isPallindrom(s));
	}
	public static boolean isPallindrom(String s) {
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) 
				return false;
			i++;
			j--;
		}
		return true;
	}

}
