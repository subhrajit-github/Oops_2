package com.Strings;

import java.util.Scanner;

public class RemoveDup {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		String res="";
		char [] ch=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if(ch[i]=='\u0000')
				continue;
			for(int j=i+1;j<s.length();j++) {
				if(ch[i]==ch[j])
					ch[j]='\u0000';
			}
			res+=ch[i];
		}
		System.out.println(res);
	}

}
