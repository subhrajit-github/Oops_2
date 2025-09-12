package com.Strings;

public class BiggestSubStringPall {

	public static void main(String[] args) {
		String s="malayalam";
		String bigpall="";
		for(int i=0;i<s.length();i++) {
			for(int j=i+3;j<s.length();j++) {
				String str=s.substring(i,j);
				if(isPallindrom(str)) {
					System.out.println(str);
				if(str.length()>bigpall.length())
					bigpall=str;
			}
		}
	}
		System.out.println("===============");
		System.out.println(bigpall);
	}
	public static boolean isPallindrom(String s) {
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

}
