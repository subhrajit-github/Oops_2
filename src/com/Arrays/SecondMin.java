package com.Arrays;

public class SecondMin {
    public static void main(String [] args) {
    	int [] a= {10,16,39,4,8,6};
    	int min1=Integer.MAX_VALUE;
    	int min2=Integer.MAX_VALUE;
    	for(int i=0;i<a.length;i++) {
    		if(min1>a[i]) {
    			min2=min1;
    			min1=a[i];
    		}
    		else if(min2>a[i] && a[i]!=min1) {
    			min2=a[i];
    		
    		}
    	}
    	System.out.println(min2);
    }
}
