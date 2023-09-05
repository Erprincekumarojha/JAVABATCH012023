package com.string;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
        //DB having userId & Password
		String dbUserId = "pk123";
		String dbPassword = "12345";
		
		//User given Details
		Scanner sc = new Scanner(System.in);
		System.out.println("Login to the Website:");
		System.out.println("=============================");
		System.out.print("Enter UserId: ");
		String userId = sc.next();
		System.out.print("Enter Password:");
		String password = sc.next();
		//check userId and & password correct or not
		if(dbUserId.equals(userId) && dbPassword.equals(password)) {
			System.out.println("Successfully Login..?");
		}else {
			System.out.println("Login Failed..?");
		}
		
		

	}

}
