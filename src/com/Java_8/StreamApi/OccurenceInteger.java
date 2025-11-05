package com.Java_8.StreamApi;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class OccurenceInteger {

	public static void main(String[] args) {
		int[] array= {1,1,2,2,3,4,5,5,6};
		Map<Integer,Long> m=Arrays.stream(array).mapToObj(i->i).collect(Collectors.groupingBy(i->i,()->new LinkedHashMap<Integer,Long>(),Collectors.counting()));
		m.forEach((i,j)->System.out.println(i+" = "+j));
	}

}
