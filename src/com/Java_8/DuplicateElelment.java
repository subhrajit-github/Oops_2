package com.Java_8;

import java.util.Arrays;
import java.util.List;

public class DuplicateElelment {

	public static void main(String[] args) {
		String s="java is very very easy java";
		String [] str=s.split(" ");
		List<String> l=Arrays.asList(str);
		l.stream().distinct().forEach(i->System.out.print(i+" "));
	}

}
