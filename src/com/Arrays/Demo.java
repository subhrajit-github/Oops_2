package com.Arrays;

import java.util.Arrays;

public class Demo {
   public static void main(String args[]) {
	   int[] a= {1,2,3};
	   m1(a);
	   System.out.println(Arrays.toString(a));
   }
   public static void m1(int[] a) {
	   a[0]++;
   }
}
