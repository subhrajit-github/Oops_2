package com.Strings;
import java.util.Scanner;
public class RevWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		String res=" ";
		int i=0;
		int j=0;
		while(j<s.length()) {
			while(j<s.length() && s.charAt(j)!=' ')
				j++;
			int k=j-1;
			while(k>=i) {
				res+=s.charAt(k);
				k--;
			}
			if(j<s.length())
				res+=" ";
			j++;
			i=j;
			
		}
		System.out.println(res);
	}

}
