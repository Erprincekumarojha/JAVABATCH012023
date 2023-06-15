package com.app;

import java.util.Scanner;

public class CalculatorProject {

	public static void main(String[] args) {

		System.out.println("\t \t Calculator Project");
		System.out.println("==================================================");
		System.out.println("+ - Add");
		System.out.println("- - Subtract");
		System.out.println("* - Multiplction");
		System.out.println("/ - Division");

		System.out.print("Please select above Option :");

		// take input from user
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		System.out.print("Please Enter First No: ");
		int a = sc.nextInt();
		System.out.print("Please Enter Second No: ");
		int b = sc.nextInt();
		System.out.println();
		// ---------------switch will start
		switch (ch) {
		case '+':
			System.out.println("Addition of a & b Number");
			System.out.println("First No : " + a);
			System.out.println("Second No : " + b);
			System.out.println("Result : " + (a + b));
			break;
		case '-':
			System.out.println("Substraction of a & b Number");
			System.out.println("First No : " + a);
			System.out.println("Second No : " + b);
			System.out.println("Result : " + (a - b));
			break;
		case '*':
			System.out.println("Multiplction of a & b Number");
			System.out.println("First No : " + a);
			System.out.println("Second No : " + b);
			System.out.println("Result : " + (a * b));
			break;
		case '/':
			System.out.println("Division of a & b Number");
			System.out.println("First No : " + a);
			System.out.println("Second No : " + b);
			System.out.println("Result : " + (a / b));
			break;
		default:
			System.out.println("please select the Correct Option in Above only.?");
			break;
		}

	}

}
