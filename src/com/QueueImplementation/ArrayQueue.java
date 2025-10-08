package com.QueueImplementation;

public class ArrayQueue {
     private Object[] a= new Object[5];
     private int p=0;
     public void add(Object e) {
    	 if(p>=a.length) increase();
    	 a[p]=e;
    	 p++;
     }
     private void increase() {
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
    	 if(isEmpty()) return null;
    	 return a[0];
     }
     public Object poll() {
    	 if(isEmpty()) return null;
    	 Object e=a[0];
    	 for(int i=1;i<size();i++) {
    		 a[i-1]=a[i];
    	 }
    	 a[--p]=null;
    	 return e;
     }
}
