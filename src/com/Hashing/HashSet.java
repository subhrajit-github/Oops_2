package com.Hashing;

public class HashSet {
		private Node[] a=new Node[10];
		private int count=0;
	public boolean add(Object key) {
		int hc=Math.abs(key.hashCode());
		int index=hc%a.length;//hash function
		if(a[index]==null) {
			a[index]=new Node(key, null);
			count++;
			return true;
		}
		Node curr=a[index];
		Node prev=null;
		while(curr!=null) {
			if(key.equals(curr.key)) return false;
			prev=curr;
			curr=curr.next;
		}
		prev.next=new Node(key,null);
		count++;
		return true;
	}
	public void display() {
		for(int i=0;i<a.length;i++) {
			Node curr=a[i];
			while(curr!=null) {
				System.out.println(curr.key);
				curr=curr.next;
			}
		}
	}


}
