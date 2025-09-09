package com.Strings;

public class Sum {

	public static void main(String[] args) {
		String s="Ram@123";
		int sum=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='0'&&ch<='9')
				//sum+=Integer.parseInt(ch+"");
			sum+=ch-'0';
		}
		System.out.println("The sum of numeric numbers present in the String = "+sum);
	}

}
