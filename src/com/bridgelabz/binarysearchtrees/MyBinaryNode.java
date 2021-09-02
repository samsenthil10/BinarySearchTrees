package com.bridgelabz.binarysearchtrees;

public class MyBinaryNode<K extends Comparable<K>>

{
	private INode<K> root;

	public void add(K key) {
		this.root=this.addRecursively(root,key);
	}

	private INode<K> addRecursively(INode<K> current, K key) {
		if(current==null)
			return new INode<>(key);
		int compareResult=key.compareTo(current.key);
		if (compareResult==0) 
			return current;
		if(compareResult<0) {
			current.left=addRecursively(current.left,key);
		}
		else {
			current.right=addRecursively(current.right, key);
		}
		return current;
	}

	public int getSize() {

		return getSizeRecursively(root);
	}

	private int getSizeRecursively(INode<K> current) {

		return (current == null) ? 0 : 1 + getSizeRecursively(current.left) + getSizeRecursively(current.right);
	}

	public boolean search(K key) {

		INode<K> current = root;
		while (current != null) {
			if ((current.key.compareTo(key)) < 0) {
				current = current.right;
			} 
			else if ((current.key.compareTo(key)) > 0) {
				current = current.left;
			} 
			else {
				return true;
			}
		}
		return false;
	}
}