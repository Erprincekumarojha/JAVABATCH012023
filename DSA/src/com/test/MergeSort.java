package com.test;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

	public static void main(String[] args) {

		int arr[] = { 40, 20, 50, 60, 30, 10, 70, 90, 80 };
		divide(arr, 0, arr.length - 1);
		// print
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void divide(int[] arr, int left, int right) {
		if (left >= right)
			return;
		// find mid value
		int mid = (left + right) / 2;
		// divide again until array become single element array
		divide(arr, left, mid);
		divide(arr, mid + 1, right);
		// finally merge all the element
		merge(arr, left, mid, right);
	}

	private static void merge(int[] arr, int low, int mid, int high) {
		List<Integer> list = new ArrayList<>();
		int left = low;
		int right = mid + 1;
		while (left <= mid && right <= high) {
			if (arr[left] <= arr[right]) {
				list.add(arr[left]);
				left++;
			} else {
				list.add(arr[right]);
				right++;
			}
		}
		while (left <= mid) {
			list.add(arr[left]);
			left++;
		}
		while (right <= high) {
			list.add(arr[right]);
			right++;
		}
		for (int i = low; i <= high; i++) {
			arr[i] = list.get(i - low);
		}
	}
}
