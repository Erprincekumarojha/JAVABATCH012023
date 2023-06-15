package com.array;

public class SumOfSubArray {

	public static void main(String[] args) {
		
		int arr[] = { 4, 1, 5, 7, 8, 9, 10 };
		int sum =  4000;
		sumOfSubArray(arr, sum);
	}

	private static void sumOfSubArray(int[] arr, int sum) {
	
		 int csum = 0;
		 for (int i = 0; i < arr.length; i++) {
			  csum = arr[i];
			  if(csum==sum) {
				  System.out.println("SubArray found at index: "+i);
				  return;
			  }
			 for (int j = i+1; j < arr.length; j++) {
				csum = csum+arr[j];
				if(csum==sum) {
					System.out.println("sum found at index "+i+" and "+j);
					return;
				}
			}
		}
		 System.out.println("No sub  array Found");
         return ;		
	}
}
