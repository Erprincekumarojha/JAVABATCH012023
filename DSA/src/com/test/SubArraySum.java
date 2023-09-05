package com.test;

import java.util.ArrayList;

public class SubArraySum {

	public static void main(String[] args) {

		int target = 4;
		int arr[] = { 1, 2, 3, 4, 2 }; // ->1 3, 2 2, 4
		ArrayList<Integer> list = new ArrayList<>();
		subArraySum(0, arr, list, target, 0);
	}

	private static void subArraySum(int index, int[] arr, ArrayList<Integer> list, int target, int sum) {

		if (index == arr.length) {
			if (sum == target) {
				System.out.println(list);
			}
		} else {
			sum = sum + arr[index];
			list.add(arr[index]);
			subArraySum(index + 1, arr, list, target, sum);
			sum = sum - arr[index];
			list.remove(list.size() - 1);
			subArraySum(index + 1, arr, list, target, sum);
		}

	}

}
