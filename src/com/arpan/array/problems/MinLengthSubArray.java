package com.arpan.array.problems;

import org.junit.Test;

import com.arpan.constant.Constants;
import com.arpan.exception.InvalidInputException;

public class MinLengthSubArray {

	public int[] getMinLengthSubArray(int[] arr, int sum)
			throws InvalidInputException {

		if (arr == null)
			throw new InvalidInputException(Constants.invalidInput);

		int start = -1;
		int end = -1;
		int minLength = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			int currentSum = 0;
			for (int j = i; j < arr.length && (j - i + 1) < minLength; j++) {
				currentSum = currentSum + arr[j];
				if (currentSum == sum) {
					start = i;
					end = j;
					minLength = j - i + 1;
					break;
				}
			}
		}
		if (start == -1 && end == -1) {
			throw new InvalidInputException("No sub array found");
		}
		int[] returnArray = new int[minLength];
		for (int i = start, k = 0; i <= end; i++, k++) {
			returnArray[k] = arr[i];
		}
		return returnArray;
	}
	
	@Test
	public void testGetMinLengthSubArray() throws InvalidInputException{
		int[] array = { 2,1,3,7,-1 };
		int k = 9;
		int[] retArray = getMinLengthSubArray(array,k);
		for(int i=0;i<retArray.length;i++)
			System.out.print(retArray[i] + " ");
	}
}
