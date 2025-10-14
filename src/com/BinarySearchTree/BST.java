package com.BinarySearchTree;

public class BST {
      Node root;
      int count=0;
      boolean flag=true;
      public boolean add(int key) {
    	  root=add(key,root);
    	  return flag;
      }
      public Node add(int key, Node n) {
    	  if(n==null) {
    		  n=new Node(key);
    		  count++;
    		  return n;
    	  }
    	  if(key<n.key) {
    		  n.left=add(key,n.left);
    	  }
    	  else if(key>n.key) {
    		  n.right=add(key,n.right);
    	  }
    	  else {
    		  flag=false;
    	  }
    	  return n;
      }
      public int size() {
    	  return count;
      }
      public void PreOrder() {
    	  PreOrder(root);
      }
      public void PostOrder() {
    	  PostOrder(root);
      }
      public void InOrder() {
    	  InOrder(root);
      }
      public void PreOrder(Node n) {
    	  if(n==null) return;
    	  System.out.println(n.key);
    	  PreOrder(n.left);
    	  PreOrder(n.right);
      }
      public void PostOrder(Node n) {
    	  if(n==null) return;
    	  PostOrder(n.left);
    	  PostOrder(n.right);
    	  System.out.println(n.key);
      }
      public void InOrder(Node n) {
    	  if(n==null) return;
    	  InOrder(n.left);
    	  System.out.println(n.key);
    	  InOrder(n.right);
      }
}
