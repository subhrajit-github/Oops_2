package com.Java_8;

import java.util.Arrays;
import java.util.List;

public class SortEven {

	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(1, 4, 2, 3);
		List<Integer> res=l.stream().filter(i->i%2==0).map(i->i*i).sorted().toList();
		System.out.println(res);
	}

}
