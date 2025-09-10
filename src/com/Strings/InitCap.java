package com.Strings;
import java.util.Scanner;
public class InitCap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='a'&&ch[i]<='z') {
				if(i==0 ||ch[i-1]==' ')
					ch[i]-=32;
			}
			
		}
		System.out.println(ch);
	}

}
