package com.Strings;

public class Panagram {

	public static void main(String[] args) {
		String s="A QuickBrown Fox Jumps Over The Lazy Dog";
		System.out.println(isPanagram(s));
	}
	public static boolean isPanagram(String s) {
		if(s.length()<26) return false;
		s=s.toLowerCase();
		for(char ch='a';ch<='z';ch++) {
			if(!s.contains(ch+"")) return false;
		}
		return true;
	}

}
