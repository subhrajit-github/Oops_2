package com.BinaryTree;

public class Node {
      Node left;
      int ele;
      Node right;
      Node(int ele){
    	  this.ele=ele;
      }
      public Node(Node left, int ele, Node right) {
    	  this.left=left;
    	  this.ele=ele;
    	  this.right=right;
      }
}
