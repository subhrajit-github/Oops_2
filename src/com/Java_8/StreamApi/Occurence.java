package com.Java_8.StreamApi;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Occurence {

	public static void main(String[] args) {
		String s="apple mango apple banana mango apple";
		String[] str=s.split(" ");	
		List<String> l=Arrays.asList(str);
		Map<String, Long> m=l.stream().collect(Collectors.groupingBy(i->i,()->new LinkedHashMap<String, Long>(),Collectors.counting()));
		m.forEach((i, j)->System.out.println(i+" = "+j));
	}

}
