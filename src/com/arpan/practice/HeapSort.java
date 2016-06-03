package com.arpan.practice;

import org.junit.Test;

import com.arpan.exception.InvalidInputException;

public class HeapSort {

	public static int len;

	public void heapSort(int[] arr) {

		len = arr.length - 1;
		buildMaxHeap(arr);
		while (len >= 0) {
			swap(arr, 0, len);
			len--;
			heapify(arr, 0);
		}
		print(arr);
	}

	private void buildMaxHeap(int[] arr) {
		for (int i = len / 2; i >= 0; i--)
			heapify(arr, i);

	}

	private void heapify(int[] arr, int i) {
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		int max = i;

		if (left <= len && arr[left] > arr[max])
			max = left;
		if (right <= len && arr[right] > arr[max])
			max = right;
		if (i != max) {
			swap(arr, i, max);
			heapify(arr, max);
		}
	}

	private void swap(int[] arr, int i, int max) {
		int temp = arr[i];
		arr[i] = arr[max];
		arr[max] = temp;
	}

	private static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i != arr.length - 1)
				System.out.print(" | ");
		}
	}

	@Test
	public void testHeapSort() throws InvalidInputException {
		int[] arr = { 1, 10, 2, 11, 4, 3, 5, 7, 66, 5, -9 };
		heapSort(arr);
	}
}
