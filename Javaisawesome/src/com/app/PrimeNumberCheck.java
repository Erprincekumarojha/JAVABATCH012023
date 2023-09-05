package com.app;

public class PrimeNumberCheck {

	public static void main(String[] args) {

		int n = -11;

		// 1 or itself | 11
		// 1 2 3 4 5 6 7 8 9 10 11
		if(n<2) {
			System.out.println(n+" is not prime number.");
			return;
		}
		boolean status  = false;
		for (int i = 2; i < n / 2; i++) {
           if(n%i==0) {
        	   status = true;
        	   break;
           }
		}
		if(status) {
			System.out.println(n+" is not prime number.");
		}else {
			System.out.println(n+" is prime number.");
		}

	}

}
