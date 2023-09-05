package com.array;

import java.util.Arrays;

public class ArrayTest {
	// 1D array example
	public static void main(String[] args) {
		// Linear search in Array
		// 1 2 4 6 8 9  -  search value n= 8;
		int arr [] = {1, 2, 4, 6, 8, 9, 50, 34, 23, 13}; //time complexity : o(n)
		int n= 10;
		boolean status = false;
		for(int i= 0 ; i< arr.length; i++) {
		  if(arr[i]==n) {
			  System.out.println(n+" is Available at index :"+i);
			  status = true;
			  break;
		  }
		}
		if(!status) {
			System.out.println(n+ " not available in array");
		}
	}

}
