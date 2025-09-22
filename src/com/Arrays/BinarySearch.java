package com.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] a= {10,20,30,40,50};
		System.out.println(search(a,30));
		System.out.println(search(a,200));
	}
public static int search(int[] a,int key) {
	int st=0;
	int end=a.length-1;
	while(st<=end) {
		int mid=(st+end)/2;
		if(a[mid]==key) return mid;
		else if(key<a[mid])  
			end=mid-1;
		else
			st=mid+1;
	}
	return -1;
}
}
