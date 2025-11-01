package com.Java_8;

import java.util.function.Function;
import java.util.function.Predicate;

public class Test5 {

	public static void main(String[] args) {
		int [] a= {1,2,3,4,5,6};
		Predicate <Integer> p=i->i%2==0;
		Function <Integer,Integer> f=i->i*i;
		for(int n:a)
		if(p.test(n))
			System.out.println(f.apply(n));
	}

}
