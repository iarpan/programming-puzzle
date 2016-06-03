package com.arpan.array.problems;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import com.arpan.constant.Constants;
import com.arpan.exception.InvalidInputException;

/*
 * 	Given two integer arrays where second array is duplicate of first array with just 1 element missing. 
    Find the element.
 	Example:
 	Input:
 	Array1 - 9 7 8 5 4 6 7 2 3 1
 	Array2 - 2 4 3 9 1 8 5 6
 	Output: 7
 */
public class FindMissingNumberFromSecondArray {

	public int getMissingNumberFromTwoArraysBySet(int[] arr1, int[] arr2)
			throws InvalidInputException {

		if (arr1 == null && arr2 == null) {
			throw new InvalidInputException(Constants.invalidInput);
		}
		if (arr1 == null && arr2.length > 0)
			return arr2[0];
		if (arr2 == null && arr1.length > 0)
			return arr1[0];

		int missignNumber = 0;
		if (arr1.length > arr2.length) {
			missignNumber = findMissingNumber(arr2, arr1);
		} else if (arr1.length < arr2.length) {
			missignNumber = findMissingNumber(arr1, arr2);
		}
		return missignNumber;
	}

	private int findMissingNumber(int[] smallerArray, int[] longerArray) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < smallerArray.length; i++) {
			set.add(smallerArray[i]);
		}
		for (int i = 0; i < longerArray.length; i++) {
			if (set.add(longerArray[i])) {
				return longerArray[i];
			}
		}
		return -1;
	}

	@Test
	public void TestGetMissingNumberFromTwoArraysBySet() {
		int[] array1 = { 9, 7, 8, 5, 4, 6, 2, 3, 1 };
		int[] array2 = { 2, 3, 4, 9, 1, 8, 5, 6 };
		try {
			System.out.print("Missing number by Set >>" );
			System.out.println(getMissingNumberFromTwoArraysBySet(array1,array2));
		} catch (InvalidInputException e) {
			e.printStackTrace();
		}
	}

	public int getMissingNumberFromTwoArraysByXOR(int[] arr1, int[] arr2)
			throws InvalidInputException {
		if (arr1 == null && arr2 == null) {
			throw new InvalidInputException(Constants.invalidInput);
		}
		if (arr1 == null && arr2.length > 0)
			return arr2[0];
		if (arr2 == null && arr1.length > 0)
			return arr1[0];
		int missignNumber = 0;
		if (arr1.length > arr2.length) {
			missignNumber = findMissingNumberByXOR(arr1, arr2);
		} else if (arr1.length < arr2.length) {
			missignNumber = findMissingNumberByXOR(arr2, arr1);
		}
		return missignNumber;
	}

	private int findMissingNumberByXOR(int[] longerArray, int[] smallerArray) {
		int result = longerArray[0];
		for (int i = 1; i < longerArray.length; i++) {
			result = result ^ longerArray[i];
		}
		for (int i = 0; i < smallerArray.length; i++) {
			result = result ^ smallerArray[i];
		}
		return result;
	}
	
	@Test
	public void TestGetMissingNumberFromTwoArraysByXOR() {
		int[] array1 = { 9, 7, 8, 5, 4, 6, 2, 3, 1 };
		int[] array2 = { 2, 3, 4, 9, 1, 8, 5, 6 };
		try {
			System.out.print("Missing number by XOR >>" );
			System.out.println(getMissingNumberFromTwoArraysByXOR(array1,array2));
		} catch (InvalidInputException e) {
			e.printStackTrace();
		}
	}
}
