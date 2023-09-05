package com.array;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {

		int arr[] = { 1, 3, 4, 5, 7, 8 };
		            //  8  7  5  4  3  1
		System.out.println(Arrays.toString(arr));

		int i = 0, j = arr.length - 1;
		while (i < j) {
           int temp  = arr[i];
           arr[i] =  arr[j];
           arr[j] = temp;
           i++; j--;
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
