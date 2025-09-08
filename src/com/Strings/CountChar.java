//input:"JspiderS@#123"
//output:Uppercase=2,lowercase=6,numerical character=3,special charater=2
package com.Strings;

public class CountChar {

	public static void main(String[] args) {
		String s="JspiderS@#123";
		int uc=0;
		int lc=0;
		int nc=0;
		int sp=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z') 
				uc++;
			else if(ch>='a' && ch<='z') 
				lc++;
			else if(ch>='0' && ch<='9')
				nc++;
			else
				sp++;
		}
		System.out.println("uc = " +uc);
		System.out.println("lc = " +lc);
		System.out.println("nc = " +nc);
		System.out.println("sp = "+sp);
	}

}
