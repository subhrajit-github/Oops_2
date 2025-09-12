package com.Strings;
import java.util.Scanner;
public class StringSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		char [] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]>ch[j]) {
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
			System.out.print(ch[i]);
		}
	}

}
