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
    public void add(int index,Object e) {
    	if(index<=-1 || index>=size()) {
    		throw new IndexOutOfBoundsException();
    	}
    	if(index == 0) {
    		first=new Node(e,first);
    		count++;
    		return;
    	}
    	Node curr=first;
    	for(int i=1;i<index;i++) {
    		curr=curr.next;
    	}
    	curr.next=new Node(e,curr.next);
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
    public void remove(int index) {
    	if(index<=-1 || index>=size()) {
    		throw new IndexOutOfBoundsException();
    	}
    	if(index==0) {
    		first=first.next;
    		if(first == null) last=null;
    		count--;
    		return;
    	}
    	Node curr=first;
    	for(int i=1;i<index;i++) {
    		curr=curr.next;
    	}
    	curr.next=curr.next.next;
		if(curr.next == null) last=curr;
		count--;
    }
    public void reverse() {
    	Node prev=null;
    	Node curr=first;
    	Node next=null;
    	while(curr!=null) {
    		next=curr.next;
    		curr.next=prev;
    		prev=curr;
    		curr=next;
    	}
    	last=first;
    	first=prev;
    }
    public String toString() {
    	if(size()==0) return "[]";
    	String s1="["+first.ele;
    	Node curr=first;
    	while(curr.next!=null) {
    		curr=curr.next;
    		s1=s1+","+curr.ele;
    	}
    	s1=s1+"]";
    	return s1;
    	}
}
