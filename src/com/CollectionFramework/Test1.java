package com.CollectionFramework;

import java.util.ArrayList;

public class Test1 {
     public static void main(String [] args) {
    	 ArrayList<Integer> l1=new ArrayList<Integer>();
    	 l1.add(10);
    	 l1.add(20);
    	 l1.add(30);
    	 l1.add(40);
    	 l1.add(50);
    	 System.out.println("l1 ="+l1);
    	 
    	 ArrayList<Integer> l2=new ArrayList<Integer>();
    	 l2.add(30);
    	 l2.add(50);
    	 l2.add(60);
    	 System.out.println("l2 ="+l2);
    	 
    	boolean res= l1.containsAll(l2);
    	 System.out.println("Does l1 contains all the elements of l2? "+res);
     }
}
