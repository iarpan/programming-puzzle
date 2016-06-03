package com.arpan.stack;

import java.util.LinkedList;

public class Stack {

	private LinkedList<Integer> stack;

	public Stack() {
		this.stack = new LinkedList<Integer>();
	}

	public void push(int value) throws IllegalAccessException {
		if (this.stack == null)
			throw new IllegalAccessException("Stack is not valid");
		stack.add(value);
	}

	public int pop() throws IllegalAccessException {
		if (this.stack == null || this.stack.isEmpty())
			throw new IllegalAccessException("Stack is not valid");
		else
			return stack.pollLast();
	}

	public int size() {
		if (this.stack == null || this.stack.isEmpty())
			return 0;
		else
			return this.stack.size();
	}
}
