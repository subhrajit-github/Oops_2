package com.Strings;

import java.util.Scanner;

public class RevSentence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		String res=" ";
		int i=s.length()-1;
		int j=s.length()-1;
		while(i>=0) {
			while(i>=0 && s.charAt(i)!=' ')
				i--;
			int k=i+1;
			while(k<=j) {
				res+=s.charAt(k);
				k++;
			}
			if(i>=0)
				res+=" ";
			i--;
			j=i;
		}
		System.out.println(res);
	}

}
