package com.two2D;

public class AddTwoMatrix {
	
	public static void main(String[] args) {
		
		int a[][] = { {1,2,3},
		              {2,3,4},
		              {4,5,7}}; // 3*3
		
		int b[][] = { {2,4,6},
		              {2,3,4},
		              {4,5,7}}; // 3*3
		
		//A*B = ?
		int c[][]  = new int[3][3];
		for (int i = 0; i < 3; i++) {
			
			for (int j = 0; j < 3; j++) {
				
				//multiplay two array and store in one c array
				c[i][j] = 0;
				
				 for (int k = 0; k < 3; k++) {
					
					c[i][j] = c[i][j]+ a[i][k]* b[k][j]; 
				}
				 
				 System.out.print(c[i][j]+  "   ");
				
				
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * //A+B int c[][] = new int[3][3]; for (int i = 0; i < 3; i++) {
		 * 
		 * for (int j = 0; j < 3; j++) {
		 * 
		 * c[i][j] = a[i][j]+b[i][j]; System.out.print(a[i][j]+b[i][j] + "  ");
		 * 
		 * } System.out.println(); }
		 * 
		 * System.out.println("\n\n");
		 * 
		 * for (int i = 0; i < c.length; i++) {
		 * 
		 * for (int j = 0; j < c.length; j++) { System.out.print(c[i][j]+ "  "); }
		 * 
		 * System.out.println(); }
		 */
		
	}

}
