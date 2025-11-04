package com.Java_8;

import java.util.Arrays;
import java.util.List;

public class SortString {

	public static void main(String[] args) {
	String s="java is very very is java";
	String [] str=s.split(" ");
	List<String> l=Arrays.asList(str);
	l.stream().distinct().sorted().forEach(i->System.out.println(i+" "));
	}

}
