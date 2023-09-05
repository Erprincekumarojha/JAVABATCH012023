package com.java;

import java.util.Scanner;

/** This class is a user-defined class that contains one methods cube. */
public class App {
	  public static int[] moveZeros(int n, int []a) {
	       
	         int start = 0, end= n-1;
	         while(start<end){
	           while(a[start]!=0) start++;
	           while(a[end]==0) end--;
	           if(start>end) break;
	           int temp = a[start];
	           a[start] = a[end];
	           a[end] = temp;
	           start++;
	           end--;
	         }
	        return a;
	    }
	
		public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
       arr =  moveZeros(n, arr);

		// printprinting the array
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");

	}


}
