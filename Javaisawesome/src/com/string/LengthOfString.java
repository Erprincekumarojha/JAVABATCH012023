package com.string;

import java.util.Scanner;

// Find the length of String
public class LengthOfString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter one String Value :");
		String str = sc.nextLine();

		System.out.println(str + " : length - " + str.length());

	}

}
