package com.Strings;

import java.util.Scanner;

public class ReplaceVowel {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		char [] ch=s.toCharArray();
		String res="";
		int count=0;
		for(int i=0;i<s.length();i++) {
			char current=ch[i];
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u') {
				count++;
			}
				if(count>=3 && (ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')) {
					res+='_';
				}
				else {
					res+=current;
				}
			
			
			
		}
		System.out.println(res);
		
	}

}
