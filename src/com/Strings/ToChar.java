package com.Strings;

public class ToChar {

	public static void main(String[] args) {
		String s="Jspiders";
		char[] ch=s.toCharArray();
		System.out.println(ch[0]);
		System.out.println(ch[3]);
		ch[0]='j';
		System.out.println(ch[0]);
		System.out.println(ch.length);
		}

}
