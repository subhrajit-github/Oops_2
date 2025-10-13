package com.CollectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Test7 {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		System.out.println(l);
		ListIterator<Integer> li=l.listIterator();
		while(li.hasNext()) {
			Integer i=li.next();
			if(i==30) {
				li.add(30);
			}
		}
		System.out.println(l);
	}

}
