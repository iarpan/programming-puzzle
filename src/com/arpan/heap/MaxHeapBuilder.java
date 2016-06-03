package com.arpan.heap;

public class MaxHeapBuilder {

	private MaxHeapBuilder() {
	}

	private static int length;

	public static void main(String[] args) {
		int[] arr = {1,10,2,11,4,3,5,7,66,5,-9};
		length = arr.length - 1;
		buildMaxHeap(arr);
		print(arr);
	}

	private static void buildMaxHeap(int[] arr) {
		if (arr != null && length > 0) {
			for (int i = length / 2; i >= 0; i--) {
				heapify(arr, i);
			}
		}
	}

	private static void heapify(int[] arr, int i) {
		int left = (2 * i) + 1;
		int right = (2 * i) + 2;
		int max = i;
		if (left < length && arr[left] > arr[max])
			max = left;
		if (right < length && arr[right] > arr[max])
			max = right;
		if (i != max) {
			swap(arr, i, max);
			heapify(arr, max);
		}
	}

	private static void swap(int[] arr, int i, int max) {
		int temp = arr[i];
		arr[i] = arr[max];
		arr[max] = temp;
	}

	private static void print(int[] arr) {
		for (int i = 0; i < length; i++) {
			System.out.print(arr[i]);
			if (i != length - 1)
				System.out.print(" | ");
		}
	}
}
