package com.Strings;

public class VowelCount {

	public static void main(String[] args) {
		String s="aireospace";
		int count=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			//if(ch=='a'||ch=='i'||ch=='e'||ch=='o'||ch=='u')//It is correct
				//count++;
			if(ch=='a') count++;
			if(ch=='i') count++;
			if(ch=='e') count ++;
			if(ch=='o') count ++;
			if(ch=='u') count++;
		}
		System.out.println("The number of vowels present in the given String : "+count);
	}

}
