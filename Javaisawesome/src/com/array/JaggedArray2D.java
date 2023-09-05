package com.array;

public class JaggedArray2D {
	public static void main(String[] args) {
		
		int arr[][] = new int[3][];
		arr[0] = new int[]{2,3};
		arr[1] = new int[]{2,3,4,5,6,7,8,9};
		arr[2] = new int[]{2,3,3,5};
		//arr[3] = new int[] {5}; Array index out of bound Exception
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}
		
	}
}
