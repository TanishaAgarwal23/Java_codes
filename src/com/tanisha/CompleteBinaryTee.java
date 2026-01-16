package com.tanisha;

public class CompleteBinaryTee {

	
	BTNode root;
	public static void main(String args[]) {
		CompleteBinaryTee tree = new CompleteBinaryTee();
		  tree.insert(new BTNode(1));
	        tree.insert(new BTNode(2));
	        tree.insert(new BTNode(3));
	        tree.insert(new BTNode(4));
	        tree.insert(new BTNode(5));
	        tree.insert(new BTNode(6));
	        tree.insert(new BTNode(7));
	    }
	public void insert(BTNode node) {
		if(root==null) {
			root=node;
		}
		else {
			insertNode(root,node);
		}
			
	}
public void insertNode(BTNode root,BTNode node) {
	if(root.getLeft()==null) {
		root.setLeft(node);
	}
	else if(root.getRight()==null) {
		root.setRight(node);
	}
	else {
		insertNode(root.getLeft(),node);
	}
}
}



}
