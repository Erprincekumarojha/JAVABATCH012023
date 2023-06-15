package logical.question;

import java.util.Scanner;

public class Test {
//6 . Write a program to check number is palindrome or not?
	// n = 121, reverse = 121
	                                   //n =  121%10 =1, 12%10 = 2, 1%10 = 1, 0
	public static int reverseNumber(int n) {  // 121   12  1 0
	    int sum = 0;  // 12*10 = 120+1  = 121
		while(n!=0) {
			int rem = n%10; // 121%10 = 1 , 1
			sum  = sum*10 + rem;
			 n = n/10; // 0
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter one Integer Value : ");
		int n = sc.nextInt();
		int reverseNumber = reverseNumber(n);
		if(n==reverseNumber) {
			System.out.println(n +" - Number is palindrome");	
		}else {
			System.out.println(n +" - Number is Not palindrome");
		}
		
	}
	
	
	

}
