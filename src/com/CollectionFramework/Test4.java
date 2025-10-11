package com.CollectionFramework;

import java.util.LinkedHashSet;
import java.util.Set;

public class Test4 {

	public static void main(String[] args) {
		Set<String> s=new LinkedHashSet<String>();
		s.add("Tarak");
		s.add("Bunny");
		s.add("Cherry");
		s.add("Das");
		s.add("Laxmi");
		s.add("Jyoti");
		for(String str:s) {
			System.out.println(str);
		}
	}

}
