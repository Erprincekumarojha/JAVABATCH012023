package com.app;

import java.io.Console;

public class ConsoleUserInput {

	public static void main(String[] args) {

		Console c = System.console();
		if(c==null) {
			System.err.println("No Console Available");
			System.exit(0);
		}
		
		String readLine = c.readLine("Enter value : ");
		System.out.println(readLine);
		
	}

}
