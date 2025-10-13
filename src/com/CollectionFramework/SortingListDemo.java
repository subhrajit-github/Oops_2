package com.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingListDemo {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(40);
		l.add(10);
		l.add(20);
		l.add(30);
		System.out.println(l);
		Collections.sort(l,new Desc());
		System.out.println(l);
	}
}
class Desc implements Comparator{
	public int compare(Object arg1,Object arg2) {
		return (Integer)arg2 - (Integer)arg2;
	}
}
