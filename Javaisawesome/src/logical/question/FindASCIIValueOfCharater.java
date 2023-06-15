package logical.question;

import java.util.Scanner;

public class FindASCIIValueOfCharater {
	//write a program to find ASCII value of 'Z' character.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter One Character : ");
		char ch = sc.next().charAt(0);
		
			System.out.println("ASCII Value "+ch+" = "+(int)ch);
	
	}

}
