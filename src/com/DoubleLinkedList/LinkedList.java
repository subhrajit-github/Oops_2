package com.DoubleLinkedList;

public class LinkedList {
     private Node first;
     private Node last;
     private int count=0;
     public void add(Object e) {
    	 if(first==null) {
    		 first=new Node(e);
    		 last=first;
    		 count++;
    		 return;
    	 }
    	 last.next=new Node(e,null,last);
    	 last=last.next;
    	 count++;
     }
     public void add(int index, Object e) {
    	 if(index<=-1 || index>= size()) {
    		 throw new IndexOutOfBoundsException();
    	 }
    	 if(index == 0) {
    		 Node n=new Node(e,first,null);
    		 first.prev=n;
    		 first=n;
    		 count++;
    		 return;
    	 }
    	 Node curr=first;
    	 for(int i=0;i<index;i++) {
    		 curr=curr.next;
    	 }
    	 Node n=new Node(e,curr.next,curr);
    	 curr.next.prev=n;
    	 curr.next=n;
    	 count++;
     }
     public void remove(int index) {
    	 if(index<=-1 || index>= size()) {
    		 throw new IndexOutOfBoundsException();
    	 }
    	 if(index == 0) {
    		 first=first.next;
    		 if(first!=null) {
    			 first.prev=null;
    		 }
    		 else {
    			 last=null;
    		 }
    		 count--;
    		 return;
    	 }
    	 Node curr=first;
    	 for(int i=0;i<index;i++) {
    		 curr=curr.next;
    	 }
    	 curr.next=curr.next.next;
    	 if(curr.next!=null) {
    		 curr.next.prev=curr;
    	 }
    	 else {
    		 last=curr;
    	 }
    	 count--;
     }
     public Object get(int index) {
    	 if(index<=-1 || index>= size()) {
    		 throw new IndexOutOfBoundsException();
    	 }
    	 Node curr=first;
    	 for(int i=1;i<index;i++) {
    		 curr=curr.next;
    	 }
    	 return curr.ele;
     }
     public void reverse() {
    	    Node curr = first;
    	    Node temp = null;
    	    while (curr != null) {
    	        temp = curr.prev;
    	        curr.prev = curr.next;
    	        curr.next = temp;
    	        curr = curr.prev;
    	    }
    	    if (temp != null) {
    	        first = temp.prev;
    	    }
    	}

     public int size() {
    	 return count;
     }
     public String toString() {
    	 if(size()==0) return "[]";
    	 String s="["+first.ele;
    	 Node curr=first;
    	 while(curr.next!=null) {
    		 curr=curr.next;
    		 s=s+","+curr.ele;
    	 }
    	 s=s+"]";
    	 return s;
     }
    
}
