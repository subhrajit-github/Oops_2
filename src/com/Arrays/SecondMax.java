package com.Arrays;

public class SecondMax {

	public static void main(String[] args) {
		int[] a= {10,16,39,39,4,8,6};
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(max1<a[i]) {
				max2=max1;
				max1=a[i];
			}
			else if(max2<a[i] && a[i]!=max1) {
				max2=a[i];
			}
		}
		System.out.println(max2);
	}

}
