package com.java;

import java.util.HashSet;
import java.util.Set;

public class FindTwoStringUnikeCharacter {

	public static char[] sortString(String s) {
		int j = 0;
		char temp = 0;
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			for (j = 0; j < chars.length; j++) {
				if (chars[j] > chars[i]) {
					temp = chars[i];
					chars[i] = chars[j];
					chars[j] = temp;
				}
			}
		}
		return chars;
	}

	public static char[] merge(char[] arr1, char[] arr2, int n, int m) {

		char[] arr3 = new char[n + m];
		int left = 0;
		int right = 0;
		int index = 0;

		while (left < n && right < m) {
			if (arr1[left] <= arr2[right]) {
				arr3[index] = arr1[left];
				left++;
				index++;
			} else {
				arr3[index] = arr2[right];
				right++;
				index++;
			}
		}

		// If right pointer reaches the end:
		while (left < n) {
			arr3[index++] = arr1[left++];
		}

		// If left pointer reaches the end:
		while (right < m) {
			arr3[index++] = arr2[right++];
		}

		return arr3;
	}

	public static void main(String[] args) {

		String s1 = "avinash";
		String s2 = "satish";
		char[] char1 = sortString(s1);
		char[] char2 = sortString(s2);

		char[] merge = merge(char1, char2, char1.length, char2.length);

		Set<Character> set = new HashSet<>();
		String output = "";
		for (int i = 0; i < merge.length; i++) {
			if (set.add(merge[i])) {
				output = output + merge[i];
			}
		}
		System.out.println(output);

	}
}
