package com.Java_8;

import java.util.Arrays;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(1, 2, 3, 4, 5);
		long res=l.stream().filter(i->i%2==0).count();
		System.out.println(res);
	}

}
