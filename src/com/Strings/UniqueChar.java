package com.Strings;

import java.util.Scanner;

public class UniqueChar {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String");
	String s=sc.nextLine();
	char[] ch=s.toCharArray();
	for(int i=0;i<ch.length;i++) {
		int count=1;
		if(ch[i]=='\u0000')
			continue;
		for(int j=i+1;j<ch.length;j++) {
			if(ch[i]==ch[j]) {
				count++;
				ch[j]='\u0000';
			}
				
		}
		if(count==1)
			System.out.print(ch[i]);
	}
	}

}
