package com.arpan.array.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HighestProductOfThreeCollection {

	private HighestProductOfThreeCollection(){}
	public static void main(String[] args) {
		int[] arr = { 1, 10, -100,8,9,47,-20};
		int highestProductOfThree = getHighestProdutOfThree(arr);
		System.out.println(highestProductOfThree);
	}

	private static int getHighestProdutOfThree(int[] arr) {
		if (arr == null || arr.length < 3)
			return -1;
		List<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			numbers.add(arr[i]);
		}
		Collections.sort(numbers);

		int max1 = numbers.get(0) * numbers.get(1) * numbers.get(numbers.size());
		int max2 = (numbers.size() - 1)	* numbers.get(numbers.size() - 2) * numbers.get(numbers.size() - 3);
		return Math.max(max1,max2);
	}
}
