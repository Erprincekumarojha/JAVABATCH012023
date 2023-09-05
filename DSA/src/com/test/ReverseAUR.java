package com.test;

import java.util.Arrays;

public class ReverseAUR {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 10 };
		reverseArray(arr, 0, arr.length);
		System.out.println(Arrays.toString(arr));
	}

	private static void reverseArray(int[] arr, int i, int N) {
		if (i >= N / 2)
			return;
		swap(arr, i, N - 1);
		reverseArray(arr, i + 1, N - 1 - i);
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
