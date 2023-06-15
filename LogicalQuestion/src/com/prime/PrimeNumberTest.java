package com.prime;

import java.util.Scanner;

//1. 2 3 5 7 11 13.................................first 6 prime number
public class PrimeNumberTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter lower & Upper bound to print prime number : ");
		System.out.println("How many first prime number do you want:");
		int n = sc.nextInt();
		//int lower = sc.nextInt();
		//int upper = sc.nextInt();
		 printfirst10PrimeNumber(n);
		//printLowerAndUpperBoundLimitPrimeNuber(lower, upper);
	}

	private static void printLowerAndUpperBoundLimitPrimeNuber(int lower, int upper) {
		// lower = 10,11,12,13,14,15,16........99, 100 upper = 100
		boolean status = false;
		for (  ; lower <= upper; lower++) {
			if(lower<2) {
				continue;
			}
			status = false;
			for (int i = 2; i <= lower / 2; i++) {
				if (lower % i == 0) {
					status = true;
				}
			}
			if (!status) {
				System.out.print(lower + " ");
			}

		}
	}

	private static void printfirst10PrimeNumber(int n) {
		// 2 3 5 7 11 13 17 19...................
		int count = 1;
		int number = 2;
		int sum  = 0;
		boolean status = false;
		while (count <= n) {
			status = false;
			for (int i = 2; i <= number / 2; i++) {
				if (number % i == 0) {
					status = true;
				}
			}

			if (!status) {
				System.out.print(number + " ");
				sum  = sum+number;
				count++;
			}
			number++;
		}
		
		System.out.println("\nFirst "+n+ " prime number sum : "+sum);

	}

}
