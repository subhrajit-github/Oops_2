package com.Strings;

public class Rev {

	public static void main(String[] args) {
		String s="Jspider";
		String res="";
		for(int i=s.length()-1;i>=0;i--) {
			res+=s.charAt(i);
		}
		System.out.println("res ="+res);
	}

}
