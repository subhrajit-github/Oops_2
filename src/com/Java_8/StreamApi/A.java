package com.Java_8.StreamApi;

import java.util.function.Function;
import java.util.function.Predicate;

public class A {
    public static boolean isEven(int n) {
    	return n%2!=0;
    }
    public int Square(int n) {
    	return n*n;
    }
    public static void main(String [] args) {
    	Predicate<Integer> p=i->i%2==0;
    	System.out.println(p.test(5));
    	Predicate<Integer> p1=A::isEven;
    	System.out.println(p1.test(7));
    	Function<Integer,Integer> f=i->i*i*i;
    	System.out.println(f.apply(5));
    	A a=new A();
    	Function<Integer,Integer> f1=a::Square;
    	System.out.println(f1.apply(5));
    }
}
