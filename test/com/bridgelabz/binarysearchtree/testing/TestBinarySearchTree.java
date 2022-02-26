package com.bridgelabz.binarysearchtree.testing;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabz.binarytree.MyBinaryTree;

import junit.framework.Assert;

public class TestBinarySearchTree {

	@Test
	public void testGiven3NumberstoBinarySearchTree_ThenSizeofTreeShoulsdReturn3Pass() {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<Integer>();
		
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		int size = myBinaryTree.getSize();
		
		Assert.assertEquals(3, size);
	}
}
