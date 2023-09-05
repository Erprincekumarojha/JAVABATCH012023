package com.array;

import java.util.Arrays;

public class RemoveDup0licateFromArray {
	
	public static void main(String[] args) {
		
	   int arr [] =  {10,20,20,40,50,30,40,50,70};
	   Arrays.sort(arr);
	   System.out.println(Arrays.toString(arr));
	   arr  =removeDuplicate(arr);
	   
	   for (int i = 0; i < arr.length; i++) {
		if(arr[i]!=0) {
			System.out.print(arr[i] + " ");
		}
	}
	}

	private static int[] removeDuplicate(int[] arr) {
		int n  = arr.length;
		if(n==1 || n==0) {
			return arr;
		}
		int temp[]  = new int[arr.length];
		int j=0;
		
		for(int i=0 ; i<arr.length-1;i++) {
		  if(arr[i]!=arr[i+1]) {
			temp[j++] = arr[i];  
		  }
		}
		
		temp[j++] = arr[arr.length-1];
		
		return temp;
	     	
	}

}
