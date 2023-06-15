package com.array;

public class Three3DArray {

	public static void main(String[] args) {

		int arr[][][] = { { {2,3}, {4,5} },
				          { {3,5}, {5,7} }   };
	
		
		//print the 3D Array
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < arr.length; k++) {
                  System.out.print(arr[i][j][k]);
				}
			}
			System.out.println();
		}
	}

}
