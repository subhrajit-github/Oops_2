package com.Sorting;
import java.util.Arrays;
public class Demo_5 {

	public static void main(String[] args) {
		Emp[] a= {
				new Emp("Manju",30000),
				new Emp("Sanju",40000),
				new Emp("Anju",50000),
				new Emp("ujju",10000),
				new Emp("Ranju",25000)
		};
		Arrays.sort(a);
		for(Emp e:a)
			System.out.println(e);
	}

}
