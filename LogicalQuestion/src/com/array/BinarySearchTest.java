package com.array;

import java.util.Arrays;

public class BinarySearchTest {
	
	public static void main(String[] args) {
		
		int arr[]  = {10,23,24,87,34,50,40};
		Arrays.sort(arr); // it will sort your array
		System.out.println(Arrays.toString(arr));
	    int search  = 100;
	    //binarySearch
	    binarySearch(arr, search);
	}

	private static void binarySearch(int[] arr, int search) {
		
		int start  = 0;
		int end = arr.length-1;
		int mid = (start+end)/2;
		while(start<=end) {
		
			  if(arr[mid]==search) {
				  System.out.println("Element found at index no: "+mid);
				  return;
			  }
			  else if(arr[mid]<search) { //no need to search value before mid
				  start  = mid+1;  // then increment the start by mid+1
			  }else if(arr[mid]>search){ // if mid value is grater then search
				  end = mid-1; // no need to check value after mid, end will be mid-1 
			  }
			 mid =  (start+end)/2; 
		}
		
		if(start>end) {
			System.out.println("Element not found!");
		}
	}

}
