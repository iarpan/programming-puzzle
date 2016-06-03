package com.arpan.array.problems;

public class FindUniqueNumbersFromArray {

	private static int len;

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 2, 3, 6, 7, 5, 6, 8, 9, 3 ,11,1,1,6,6,6,6};
		len = arr.length - 1;
		heapify(arr);
		for (int i = len; i >= 0; i--) {
			exchange(arr, 0, len);
			len--;
			createMaxHeap(arr, 0);
		}
		 print(arr);
		 System.out.println();
		for (int j = 0; j <= arr.length - 1; j++) {
			if (j == 0 && arr[j] != arr[j + 1]) {
				System.out.println(arr[j]);
			} else if (j == arr.length - 1 && arr[j] != arr[j - 1]) {
				System.out.println(arr[j]);
			} else if (j!=0 && arr[j] != arr[j - 1] && arr[j] != arr[j + 1]) {
				System.out.println(arr[j]);
			}
		}
	}

	private static void heapify(int[] arr) {
		for (int i = len / 2; i >= 0; i--)
			createMaxHeap(arr, i);
	}

	private static void createMaxHeap(int[] arr, int i) {
		int left = i * 2 + 1;
		int right = i * 2 + 2;
		int max = i;
		if (left <= len && arr[left] > arr[max])
			max = left;
		if (right <= len && arr[right] > arr[max])
			max = right;
		if (i != max) {
			exchange(arr, i, max);
			createMaxHeap(arr, max);
		}

	}

	private static void exchange(int[] arr, int i, int max) {
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
}
