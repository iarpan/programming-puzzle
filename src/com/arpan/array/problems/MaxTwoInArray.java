package com.arpan.array.problems;

public class MaxTwoInArray {

	private MaxTwoInArray() {
	}

	public static void main(String[] args) {

		int[] arr = { 3, 1, 2, 9, 0, 7, 23, 87, 67, 54, 101, 4, 409, -10 };
		int max1 = Math.max(arr[0], arr[1]);
		int max2 = Math.min(arr[0], arr[1]);
		int current;

		for (int i = 2; i < arr.length; i++) {
			current = arr[i];
			if (current > max1) {
				max2 = max1;
				max1 = current;
			} else if (current > max2) {
				max2 = current;
			}
		}
		System.out.println("Max1 =" + max1 + " AND Max2 =" + max2);
	}
}
