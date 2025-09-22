package com.Arrays;

import java.util.Arrays;

public class Sum {

	public static void main(String[] args) {
		int [] a= {1,2,3};
		int [] b= {1,2,3,4,5};
		int n=a.length<b.length?a.length:b.length;
		for(int i=0;i<n;i++) {
			if(a.length>b.length)
				a[i]+=b[i];
			else
				b[i]+=a[i];
		}
		b=a.length>b.length?a:b;
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}

}
