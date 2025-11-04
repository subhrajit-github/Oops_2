package com.Java_8;

import java.util.Arrays;
import java.util.List;

public class Duplicate {

	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(6, 7, 8, 6, 5, 4, 5, 3, 4, 3, 2, 1, 1);
		List<Integer> res=l.stream().sorted().distinct().toList();
		System.out.println(res);
	}

}
