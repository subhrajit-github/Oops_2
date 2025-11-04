package com.Java_8;

import java.util.Arrays;

public class Remove {

	public static void main(String[] args) {
		int [] a= {5, 4, 3, 4, 5, 6,7, 2, 1, 1};
		int [] res=Arrays.stream(a).distinct().toArray();
		System.out.println(Arrays.toString(res));
	}

}
