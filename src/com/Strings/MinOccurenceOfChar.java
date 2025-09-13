package com.Strings;

public class MinOccurenceOfChar {

	public static void main(String[] args) {
		String s1="efgrzhsknhzzgewkuagjgnchukezhfcnvkj";
		String s2="";
		int mincount=s1.length();
		char minchar=' ';
		while(s1.length()>0) {
			char ch=s1.charAt(0);
			s2=s1.replace(ch+"", "");
			int count=s1.length()-s2.length();
			if(mincount>count) {
				mincount=count;
				minchar=ch;
			}
			System.out.println(ch+" = "+count);
			s1=s2;
		}
		System.out.println("===========");
		System.out.println(minchar+" = "+mincount);
	}

}
