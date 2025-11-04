package com.Java_8;

import java.util.Arrays;
import java.util.List;

public class Employee {

	public static void main(String[] args) {
		Emp e1=new Emp("Subhrajit", 'm');
		Emp e2=new Emp("surbhi", 'f');
		List<Emp> l=Arrays.asList(e1, e2);
		long m=l.stream().filter(i->i.gender=='m').count();
		System.out.println("male count :"+m);
		System.out.println("female count :"+(l.size()-m));
	}

}
