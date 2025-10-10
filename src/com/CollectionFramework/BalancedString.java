package com.CollectionFramework;

import java.util.Stack;

public class BalancedString {

	public static void main(String[] args) {
		System.out.println(isBalanced("[{}()]"));
	}
	
	static boolean isBalanced(String s) {
		Stack<Character> st=new Stack<Character>();
		for(int i=0;i<s.length();i++) {
			char ch1=s.charAt(i);
			if(ch1=='{' || ch1=='(' || ch1=='[') {
				st.push(ch1);
			}
			else if(ch1=='}' || ch1==')' || ch1==']') {
				if(st.isEmpty()) return false;
				char ch2=st.pop();
				if(!match(ch2,ch1)) return false;
			}
		}
		if(st.isEmpty()) return true;
		else return false;
	}
	static boolean match(char c1,char c2) {
		if(c1=='{' && c2=='}') return true;
		if(c1=='[' && c2==']') return true;
		if(c1=='(' && c2==')') return true;
		return false;
	}

}
