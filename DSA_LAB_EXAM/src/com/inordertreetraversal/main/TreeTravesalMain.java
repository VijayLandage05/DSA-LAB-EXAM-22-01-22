package com.inordertreetraversal.main;

import com.inordertreetraversal.demo.Node;
import com.inordertreetraversal.demo.TreeTraversal;

public class TreeTravesalMain {
	
public static void main(String[] args) {
		
		TreeTraversal bt = new TreeTraversal();
	 
		bt.root = new Node(10);
		bt.root.left = new Node(7);
		bt.root.right = new Node(8);
		bt.root.left.left = new Node(3);
		bt.root.left.right = new Node(5);
		bt.root.right.left = new Node(9);
		bt.root.right.right = new Node(11);
		
		
		System.out.print("Inorder Traversal is : ");
		bt.printInorder(bt.root);
	}
}
