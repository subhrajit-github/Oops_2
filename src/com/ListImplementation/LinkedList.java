package com.ListImplementation;

public class LinkedList {
    private Node first=null;
    private Node last=null;
    private int count=0;
    void add(Object e) {
    	if(first==null) {
    		first=new Node(e,null);
    		last=first;
    		count++;
    		return;
    	}
    	last.next=new Node(e,null);
    	last=last.next;
    	count++;
    }
    public int size() {
    	return count;
    }
    public Object get(int index) {
    	if(index<=-1 || index>=size()) {
    		return new IndexOutOfBoundsException();
    	}
    	Node curr=first;
    	for(int i=1;i<=index;i++) {
    		curr=curr.next;
    	}
    	return curr.ele;
    }
}
