package com.BinarySearchTree;

public class Test1 {

	public static void main(String[] args) {
		BST b=new BST();
		b.add(50);
		b.add(30);
		b.add(70);
		b.add(10);
		b.add(40);
		b.add(60);
		b.add(90);
		b.add(10);
		b.PostOrder();
		System.out.println("------------");
		b.PreOrder();
		System.out.println("------------");
		b.InOrder();
	}

}
