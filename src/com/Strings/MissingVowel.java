package com.Strings;
import java.util.Scanner;
public class MissingVowel {

	public static void main(String[] args) {
		String s="AEIOUaeiou";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s1=sc.nextLine();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(!s1.contains(ch+""))
				System.out.print(ch);
		}
	}

}
