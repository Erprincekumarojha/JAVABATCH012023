package com.array;

import java.util.Arrays;

//1. Find the minimum and maximum element in an array
public class FindMaxMinValueFromArray {

	/*
	 * public static void sort(int arr[]) { // write a logic to sort the given Array
	 * for (int i = 0; i < arr.length; i++) { // bubble sorting
	 * 
	 * for (int j = 0; j < arr.length; j++) {
	 * 
	 * if (arr[i] < arr[j]) { int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp; } }
	 * 
	 * } }
	 */
	public static void main(String[] args) {

		int arr[] = { 5, 12, 6, 8, 90 };
		// System.out.println(Arrays.toString(arr));
		// sort : 5 , 6, 8, 12, 90 -- Array Store the Data based on index
		// Arrays.sort(arr); // pre-defined method & class
		// sort(arr);
		// System.out.println(Arrays.toString(arr));

		int max = -65535;
		int min = 65535;
		for (int i = 0; i < arr.length; i++) {
          if(arr[i]>max) {
        	  max = arr[i]; 
          }
          if(arr[i]<min) {
        	  min  = arr[i];
          }
		}
		System.out.println("min value: " + min);
		System.out.println("max value: " + max);
	}

}
