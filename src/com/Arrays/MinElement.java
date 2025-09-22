package com.Arrays;

public class MinElement {

	public static void main(String[] args) {
		int [] a= {1,2,3,4,-4,-1,5,6};
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(min>a[i])
				min=a[i];
		}
		System.out.println(min);
	}

}
