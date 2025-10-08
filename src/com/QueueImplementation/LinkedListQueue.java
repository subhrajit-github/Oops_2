package com.QueueImplementation;

public class LinkedListQueue {
     private Node first=null;
     private Node last=null;
     private int count=0;
     
     public void add(Object e) {
    	 if(first==null) {
    		 first =new Node(e);
    		 last=first;
    		 count++;
    		 return;
    	 }
    	 last.next=new Node(e);
    	 last=last.next;
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
    	 if(isEmpty()) return false;
    	 return first.ele;
     }
     public Object poll() {
    	 if(isEmpty()) return false;
    	 Object e=first.ele;
    	 first=first.next;
    	 if(first==null) last=null;
    	 count--;
    	 return e;
     }

}
