package com.Strings;
import java.util.Scanner;
public class UpToLo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='A'&&ch[i]<'Z')
				ch[i]+=32;
			else if(ch[i]>'a'&&ch[i]<'z')
				ch[i]-=32;
		}
		System.out.println(s);
		System.out.println(ch);
	}

}
