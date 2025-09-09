package com.Strings;

import java.util.Scanner;

public class PallindromString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		String sum="";
		for(int i=s.length()-1;i>=0;i--) {
			char ch=s.charAt(i);
			sum+=ch;
		}
		if(s.equals(sum)) {
			System.out.println("it is a pallindrome string");
		}
		else {
			System.out.println("it is not a pallindrome string");
		}
	}

}
