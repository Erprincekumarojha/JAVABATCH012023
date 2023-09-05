package com.test;

import java.util.ArrayList;

public class SubSequenceArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3 };
		ArrayList<Integer> list = new ArrayList<>();
		sub(arr, 0, list);
	}

	private static void sub(int[] arr, int index, ArrayList<Integer> list) {

		// base condition
		if (index == arr.length) {
			if (list.size() > 0)
				System.out.println(list.toString().replace("[", "").replace("]", ""));
		} else {

			// not take
			sub(arr, index + 1, list);
			list.add(arr[index]);

			// now take include
			sub(arr, index + 1, list);

			list.remove(list.size() - 1);
		}

	}
}
