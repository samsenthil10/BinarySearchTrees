package com.bridgelabz.binarysearchtrees;

public class BinaryTreeMain {
	public static void main(String[] args) {
		
		MyBinaryNode<Integer> myBinaryTree = new MyBinaryNode<Integer>();
		
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		
		myBinaryTree.add(22);
		myBinaryTree.add(40);
		myBinaryTree.add(11);
		myBinaryTree.add(3);
		myBinaryTree.add(16);
		myBinaryTree.add(60);
		myBinaryTree.add(95);
		myBinaryTree.add(65);
		myBinaryTree.add(63);
		myBinaryTree.add(67);
		
		int size=myBinaryTree.getSize();
		System.out.println("Size of the Binary Search Tree: "+size);
		
		Integer findKey=63;
		if(myBinaryTree.search(findKey))
			System.out.println("Key present");
		else
			System.out.println("Key Not Found!");
	}
}