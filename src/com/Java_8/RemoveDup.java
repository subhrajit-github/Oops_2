package com.Java_8;

public class RemoveDup {

	public static void main(String[] args) {
		String s="javadev";
		s.chars().distinct().mapToObj(i->(char)i).forEach(i->System.out.print(i));
	}

}
