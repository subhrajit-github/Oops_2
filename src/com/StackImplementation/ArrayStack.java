package com.StackImplementation;

import java.util.EmptyStackException;

public class ArrayStack {
    private Object[] a=new Object[5];
    private int p=0;
    
    public void push(Object e) {
    	if(p>=a.length) increase();
    	a[p]=e;
    	p++;
    }
    public void increase() {
    	Object[] temp=new Object[a.length+3];
    	for(int i=0;i<a.length;i++) {
    		temp[i]=a[i];
    	}
    	a=temp;
    }
    public int size() {
    	return p;
    }
    public boolean isEmpty() {
    	if(size()==0) return true;
    	return false;
    }
    public Object peek() {
    	if(isEmpty()) {
    		throw new EmptyStackException();
    	}
    	return a[p-1];
    }
    public Object pop() {
    	if(isEmpty()) {
    		throw new EmptyStackException();
    	}
    	Object e=a[--p];
    	a[p]=null;
    	return e;
    }
}
