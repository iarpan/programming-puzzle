package com.arpan.array.problems;

import org.junit.Test;

public class RotateArray {

	public void rotateArrayNaive(int[] arr, int k){
		int temp;
		for(int i = 1 ; i <= k ; i++){
			temp = arr[0];
			for(int j = 0; j < arr.length - 1 ; j ++){
				arr[j] = arr[j+1];
			}
			arr[arr.length - 1] = temp;
		}
		for(int i = 0 ; i < arr.length ; i++)
			System.out.print(arr[i] + " ");
	}
	
	@Test
	public void testRotateArrayNaive(){
		 int[] array = {1,2,3,4,5};
		 int k = 7;
		 rotateArrayNaive(array,k);
	}
}
