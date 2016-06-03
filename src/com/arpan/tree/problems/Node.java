package com.arpan.tree.problems;

public class Node {

	int value;
	Node left;
	Node right;

	public Node(int value) {
		super();
		this.value = value;
	}

	public Node(int value, Node left, Node right) {
		super();
		this.value = value;
		this.left = left;
		this.right = right;
	}
}
