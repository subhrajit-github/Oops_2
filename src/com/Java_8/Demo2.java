package com.Java_8;

import java.util.Arrays;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {
		String [] s= {"Amul", "Amar", "Vijay", "Ajay", "Nikhil", "Avil"};
		List<String> l=Arrays.asList(s);
		List<String> res=l.stream().filter(i->i.startsWith("A")).map(i->i.toUpperCase()).toList();
		System.out.println(res);
	}

}
