package com.app;

public class InitilizationBlockTest {

	int x; // instance variable
	
	{   // non-static block
	    x = 20;
	    System.out.println("Initlization block x :"+x);
	}
	
	{
	    x = 23;
	    System.out.println("Initlization block x :"+x);
	}
	
	public static void main(String[] args) {
		//System.out.println("main");
		
		InitilizationBlockTest a1 = new InitilizationBlockTest();
		InitilizationBlockTest a2 = new InitilizationBlockTest();
		InitilizationBlockTest a3 = new InitilizationBlockTest();
		InitilizationBlockTest a4 = new InitilizationBlockTest();
		
	}

}
