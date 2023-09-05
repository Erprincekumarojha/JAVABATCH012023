package com.two2D;

public class FindPrimarySecondaryDigonalSub {
	
	public static void main(String[] args) {
		
		int arr[][] = { {1,2,3},
				        {2,3,4},
				        {4,5,7}}; // 3*3
		int psum = 0;
		int ssum = 0;
		for (int i = 0; i < 3 ; i++) { // row
			
			for (int j = 0; j < 3; j++) { // column
				
				 if(i==j) {
					 psum = psum + arr[i][j];  // psum += arr[i][j]; 
				 }
				 
				 if(i+j==2) {
					 ssum = ssum + arr[i][j];  
				 }
			}
		}
		
		System.out.println("Primary Digonal Sum : "+psum);
		System.out.println("Secondary Digonal Sum : "+ssum);
		
		System.out.println("PD-SD sub is : "+(psum-ssum));
	}

}
