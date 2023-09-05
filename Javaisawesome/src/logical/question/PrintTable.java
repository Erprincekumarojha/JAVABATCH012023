package logical.question;

import java.util.Scanner;

public class PrintTable {

	public static void printTable(int n, double d) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + "*" + i + " = " + n * i);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number : ");
		int n = sc.nextInt();
        printTable(n, 3.4);
	}

}
