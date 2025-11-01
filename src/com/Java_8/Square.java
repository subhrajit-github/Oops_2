package com.Java_8;

import java.util.function.Function;

public class Square {

	public static void main(String[] args) {
		Function<Integer, Integer> f=i->i*i;
		System.out.println(f.apply(5));
		System.out.println(f.apply(20));
	}

}
