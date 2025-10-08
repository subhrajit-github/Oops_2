package com.StackImplementation;

import java.util.EmptyStackException;

public class LinkedListStack {
     private Node first=null;
     private Node last=null;
     private int count=0;
     
     public void push(Object e) {
    	 if(first==null) {
    		 first=new Node(e);
    		 last=first;
    		 count++;
    		 return;
    	 }
    	 Node n=new Node(e);
    	 n.next=first;
    	 first=n;
    	 count++;
     }
     public int size() {
    	 return count;
     }
     public boolean isEmpty() {
    	 if(size()==0) return true;
    	 return false; 
     }
     public Object peek() {
    	 if(isEmpty()) {
    		 throw new EmptyStackException();
    	 }
    	 return first.ele;
     }
     public Object pop() {
         if (isEmpty()) throw new EmptyStackException();
         Object e = first.ele;
         first = first.next;
         if(first==null) last=null;
         count--;
         return e;
     }
}
