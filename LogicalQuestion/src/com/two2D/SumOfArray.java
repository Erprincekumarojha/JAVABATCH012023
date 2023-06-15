package com.two2D;

public class SumOfArray {
	
	
	public static void main(String[] args) {
		
		int arr[] = {10,20,30,60,80,60};
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			 sum =  sum + arr[i];
		}
		
		System.out.println("Sum of Arrays value : "+sum);
		System.out.println("Avarage of Arrays value : "+(sum/arr.length));
		
	}

}
