package com.arpan.tree.problems;

public class TreeTest {

	public static void main(String[] args) {
		
		Node root = new Node(20);
		BST bst = new BST(root);
		bst.insert(10);
		bst.insert(5);
		bst.insert(3);
		bst.insert(15);
		bst.insert(18);
		bst.insert(25);
		printHelper(root,"");
	}
	
	private static void printHelper(Node root, String indent) {
	    if (root == null) {
	      //System.out.println(indent);
	      return;
	    }

	    // Pick a pretty indent.
	    String newIndent;
	    if (indent.equals("")) {
	      newIndent = "- ";
	    }
	    else {
	      newIndent = "--" + indent;
	    }

	    printHelper(root.left, newIndent);
	    System.out.println(indent + root.value);
	    printHelper(root.right, newIndent);
	  }

}
