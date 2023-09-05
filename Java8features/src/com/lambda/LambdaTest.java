package com.lambda;

interface Calculator{
     int addition(int a, int b);
}

public class LambdaTest {

	public static void main(String[] args) {
	
		 Calculator cal  = ( a,  b) ->	a+b; 
	
		 
		System.out.println( cal.addition(20, 30));
		System.out.println( cal.addition(60, 30));
		System.out.println( cal.addition(10, 30));
	}

}
