package com.Java_8.StreamApi;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class A1 {
      int i;
      int j;
      A1(){	  
      }
      A1(int i){
    	  this.i=i;  
      }
      A1(int i, int j){
    	  this.i=i;
    	  this.j=j;
      }
	public static void main(String[] args) {
		Supplier<A1> sp=A1::new;
		A1 a1=sp.get();
		System.out.println(a1.i+"\t"+a1.j);
		Function<Integer,A1> f=A1::new;
		A1 a2=f.apply(10);
		System.out.println(a2.i+"\t"+a2.j);
		BiFunction<Integer, Integer,A1> b=A1::new;
		A1 a3=b.apply(20, 30);
		System.out.println(a3.i+"\t"+a3.j);
	}

}
