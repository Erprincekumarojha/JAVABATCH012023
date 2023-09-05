package com.app.pattern; //11 12 13   .....   1,10

public class PatternTest {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			// print space
			for (int s = 1; s <= 5 - i; s++) {
             System.out.print(" ");
			}

			// print star
			for (int j = 1; j <= i; j++) {
               System.out.print("* ");
			}

			System.out.println();

		}

	}

}
