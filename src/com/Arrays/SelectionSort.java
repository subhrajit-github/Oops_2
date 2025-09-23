package com.Arrays;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int [] a= {10,4,2,7,3,10};
		sort(a);
		System.out.println(Arrays.toString(a));
	}
	public static void sort(int[] a) {
		for(int i=0;i<a.length;i++) {
			int SmallEleIndex=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[SmallEleIndex])
					SmallEleIndex=j;
			}
			int temp=a[i];
			a[i]=a[SmallEleIndex];
			a[SmallEleIndex]=temp;
		}
	}

}
