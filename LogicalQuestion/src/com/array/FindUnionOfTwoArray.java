package com.array;

import java.util.HashSet;
import java.util.Set;

public class FindUnionOfTwoArray {

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 5, 9 };
		int arr2[] = { 5, 6, 7, 9 };
		Set<Integer> intersection = unionOfArray(arr1, arr2);
		System.out.println(intersection);
	}

	private static Set<Integer> unionOfArray(int[] arr1, int[] arr2) {
		Set<Integer> set = new HashSet<>();
		Set<Integer> intersection = new HashSet<>();
		for (Integer i : arr1) {
			set.add(i);
		}
		for (Integer i : arr2) {// it will not store duplicate value in set
			if (!set.add(i)) {
				intersection.add(i);
			}
		}
		return intersection;
	}

}
