package com.CollectionFramework;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Test6 {

	public static void main(String[] args) {
		Set<Integer> s=new LinkedHashSet<Integer>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		s.add(6);
		s.add(7);
		s.add(8);
		s.add(9);
		s.add(10);
		Iterator<Integer> i=s.iterator();
		while(i.hasNext()) {
			int n=i.next();
			if(n%2==0)
				i.remove();
		}
		System.out.println(s);
	}

}
