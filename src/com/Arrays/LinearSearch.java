package com.Arrays;

public class LinearSearch {

	public static void main(String[] args) {
		int [] a= {10,20,30,40,50};
		System.out.println(search(a,40));
		System.out.println(search(a,200));
	}
	public static int search(int [] a,int key) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==key) 
				return i;
		}
		return -1;
	}

}
