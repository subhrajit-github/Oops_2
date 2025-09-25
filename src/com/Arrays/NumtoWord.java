package com.Arrays;

public class NumtoWord {

	public static void main(String[] args) {
		int num=21223496;
		convert(num/10000000,"crore ");
		convert((num/100000)%100,"lakhs ");
		convert((num/10000)%100,"thousands ");
		convert((num/100)%10,"hundreds ");
		convert((num%100)," ");
	}
	public static void convert(int n,String s) {
		String[] one= {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String [] two= {"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
		if(n<=19)
			System.out.print(one[n]+" ");
		else
			System.out.println(two[n/10]+" "+one[n%10]+" ");
		if(n!=0)
			System.out.print(s);
	}

}
