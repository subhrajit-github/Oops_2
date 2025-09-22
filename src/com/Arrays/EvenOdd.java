package com.Arrays;

public class EvenOdd {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6,7,8};
		for(int elements:arr) {
			if(elements%2==0)
				System.out.println("even :"+elements);
			else if(elements%2!=0)
				System.out.println("odd :"+elements);
		}
	}

}
