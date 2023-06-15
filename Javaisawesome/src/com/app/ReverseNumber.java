package com.app;

public class ReverseNumber {
	// n = 123 reverse = 321
	public static void main(String[] args) {

		int n = 123234567; // first get last digit, next remove the last digit, again and 
		int number = n; // 123  12  1
		int sum= 0; // 0 3 32  321
		while(n!=0) {
			int rem = n%10; // 3 2 1
			sum = sum * 10 + rem;
			n  = n/10;
		}
		
		System.out.println("Reverse of "+number+" : "+sum);
		
		
	}

}
