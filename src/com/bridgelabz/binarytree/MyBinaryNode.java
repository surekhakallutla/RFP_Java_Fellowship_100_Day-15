package com.bridgelabz.binarytree;

public class MyBinaryNode<K extends Comparable<K>> {
	K key;
	MyBinaryNode<K> right;
	MyBinaryNode<K> left;
	
	public MyBinaryNode(K key) {
		this.right = null;
		this.key = key;
		this.left = null;
	}
	
}
