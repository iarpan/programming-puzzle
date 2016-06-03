package com.arpan.array.problems;

import org.junit.Test;

public class HighestProductOfThreeLinear {

	public int getHighestProductOfThree(int[] arr) {
		if (arr == null || arr.length < 3)
			return -1;

		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;

		int min1 = 0;
		int min2 = 0;

		for (int i = 0; i < arr.length; i++) {
			int current = arr[i];
			if (current > max3) {
				max1 = max2;
				max2 = max3;
				max3 = current;
			} else if (current > max2) {
				max1 = max2;
				max2 = current;
			} else if (current > max1) {
				max1 = current;
			}
			if (current < 0) {
				if (current < min2) {
					min1 = min2;
					min2 = current;
				} else if (current < min1) {
					min1 = current;
				}
			}
		}
		return Math.max(max1 * max2 * max3, min1 * min2 * max3);
	}

	@Test
	public void testGetHighestProductOfThree() {
		int[] arr = { 1, 2, 3, -10, 5, 4, -5, -1, 9, 8 };
		// int[] arr = { 3,-4, -3, -1 };
		System.out.println(getHighestProductOfThree(arr));
	}
}
