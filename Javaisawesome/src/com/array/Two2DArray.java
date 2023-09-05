package com.array;

public class Two2DArray {

	public static void main(String[] args) {

		int arr[][] = { { 1,  2,   3},
				        { 2,  3,   4},
				        { 3,  5,   6 }     };
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr.length; j++) {
				
				  if(i==j) {
					  System.out.println(arr[i][j]+ " ");
					  sum = sum+arr[i][j];
				  }
			}
		}
		
		System.out.println("output : "+sum);
	}
}
