package com.Two_D_Array;

public class SecondMinElement {

	public static void main(String[] args) {
		int [][] a= {{-1,2,3},{-4,3,2},{-3,-2,-1}};
		int min1=Integer.MAX_VALUE;
		int min2=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(min1>a[i][j]) {
					min2=min1;
					min1=a[i][j];
				}
				else if(a[i][j]<min2 && a[i][j]!=min1) {
					min2=a[i][j];
				}
			}
		}
		System.out.println("First Minimum Element : "+min1);
		System.out.println("Second Minimum Element : "+min2);
	}

}
