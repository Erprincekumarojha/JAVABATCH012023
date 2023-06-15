package com.app;

//5! = 5*4*3*2*1 = 120
public class FactorialNumber {

	public static void main(String[] args) {
		int n = 5;
        // 1*2*3*4*5 = 120
		int factorial = 1; // 1 2 6 24 120
		for(int i = 1 ; i<=n ; i++) {  // i= 1 2 3 4 5 6
			factorial  = factorial*i;
		}
		
		System.out.println("Factorial of "+n+"! : "+factorial);
	}

}
