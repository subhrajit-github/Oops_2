package com.Arrays;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
	int [] a= {5,3,6,7,1,2,3};
	sort(a);
	System.out.println(Arrays.toString(a));
	}
	public static void sort(int [] a) {
		for(int i=1;i<a.length;i++) {
			int j=i-1;
			int key=a[i];
			while(j>=0 && a[j]>key) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
	}

}
