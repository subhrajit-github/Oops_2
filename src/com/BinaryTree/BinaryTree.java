package com.BinaryTree;

import java.util.Scanner;

public class BinaryTree {
      Node root=null;
      public void add() {
    	  System.out.println("Enter root Element:");
    	  root=new Node(new Scanner(System.in).nextInt());
    	  populate(root);
      }
      public void populate(Node n) {
    	  System.out.println("Do you want to insert Element left side of :"+n.ele);
    	  boolean left=new Scanner(System.in).nextBoolean();
    	  if(left) {
    		  n.left=new Node(new Scanner(System.in).nextInt());
    		  populate(n.left);
    	  }
    	  System.out.println("Do you want to insert Element right side of :"+n.ele);
    	  boolean right=new Scanner(System.in).nextBoolean();
    	  if(right) {
    		  n.right=new Node(new Scanner(System.in).nextInt());
    		  populate(n.right);
    	  }
      }
      public void display() {
    	  PrettyDisplay(root,0);
      }
      public void PrettyDisplay(Node n, int level) {
    	  if(n==null)
    		  return;
    	  PrettyDisplay(n.right,level+1);
    	  if(level!=0) {
    		  for(int i=0;i<level-1;i++)
    			  System.out.println("|\t");
    		  System.out.println("|----->"+n.ele);
    	  }
    	  else
    		  System.out.println(n.ele);
    	  PrettyDisplay(n.left,level+1);
      }

}
