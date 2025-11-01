package com.Java_8;

import java.util.function.Function;
import java.util.function.Predicate;

public class Test6 {

	public static void main(String[] args) {
		String [] s= {"Ram", "Sita", "Laxman", "Waali", "Ravan", "Hanuman"};
		Predicate<String> p=i->i.length()>=5;
		Function<String, String> f=i->i.toUpperCase();
		for(String n:s)
			if(p.test(n))
				System.out.println(f.apply(n));
		
	}

}
