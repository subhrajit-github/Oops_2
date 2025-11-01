package com.Java_8;

import java.util.function.Predicate;

public class EvenorOdd {

	public static void main(String[] args) {
		Predicate<Integer> p=i->i%2==0;
		System.out.println(p.test(2));
		System.out.println(p.test(5));
	}

}
