package com.array;

import java.util.Arrays;

public class RotateArrayByOne {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(arr));
		rotateArrayByOne(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void rotateArrayByOne(int[] arr) {
		
		int temp = arr[arr.length-1];
		for(int i= arr.length-1; i>0 ; i--){
		    arr[i] = arr[i-1];
		}
		arr[0] = temp;
	}
}
