package logical.question;

import java.util.Scanner;

public class NumberEachDigitSum {

	// Write a Java program and compute the sum of an integer's digits.
	// input : n = 123
	// output : 1+2+3 = 6

	public static int sumOfNumberDigit(int n) {
		int sum = 0;
		while (n != 0) {
			int rem = n % 10;
			sum = sum + rem;
			n = n / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Provide Any Number : ");
		int n = sc.nextInt();
		int sum = sumOfNumberDigit(n);
		System.out.println("Sum of Number Digit is " + n + " = " + sum);

	}

}
