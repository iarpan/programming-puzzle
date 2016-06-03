package com.arpan.stack;


public class StackTest {

	public static void main(String[] args) throws IllegalAccessException{
		int[] arr = { 3, 1, 2, 9, 0, 7, 23, 87, 67, 54, 101, 4, 409, -10 };
		Stack stack = new Stack();
		for(int i = 0 ; i < arr.length;i++){
			stack.push(arr[i]);
		}
		for(int i = 0 ; i < arr.length;i++){
			System.out.print("|" + stack.pop() + "|");
			System.out.println();
			System.out.println("____");
		}
		
		System.out.println(stack.size());
	}
}
