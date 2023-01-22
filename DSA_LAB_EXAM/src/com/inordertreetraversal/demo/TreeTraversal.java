package com.inordertreetraversal.demo;

public class TreeTraversal {
	
	public Node root;
	
	public void printInorder(Node node) {
		if(node == null) {
			return;
		}
		printInorder(node.left);
		System.out.print(node.key+" ");
		printInorder(node.right);
	}
}
