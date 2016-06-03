package com.arpan.tree.problems;

public class BST {

	private Node root;

	public BST(Node root) {
		super();
		this.root = root;
	}

	public void insert(int value) {
		Node node = new Node(value);
		if (root == null) {
			root = node;
			return;
		}
		insert(root, node);
	}

	private void insert(Node currentRoot, Node node) {
		if (node.value <= currentRoot.value) {
			insertToLeft(currentRoot, node);
		}
		else if (node.value > currentRoot.value) {
			insertToRight(currentRoot, node);
		}
	}

	private void insertToLeft(Node latestRoot, Node node) {
		if (latestRoot.left == null) {
			latestRoot.left = node;
			return;
		} else {
			insert(latestRoot.left, node);
		}
	}

	private void insertToRight(Node latestRoot, Node node) {
		if (latestRoot.right == null) {
			latestRoot.right = node;
			return;
		} else {
			insert(latestRoot.right, node);
		}
	}
}
