package com.app;

public class ConstructorTest {

	int x;

	public ConstructorTest() { // default constructor
		
	}
	public ConstructorTest(int n) {
		x = n;
		System.out.println(x);
	}
	
	public ConstructorTest(int n, int a) {
		x = n;
		System.out.println(x);
	}
	
	public ConstructorTest(int n, double a) {
		x = n;
		System.out.println(x);
	}
	
	

	public static void main(String[] args) {
		System.out.println("main start");
		ConstructorTest a = new ConstructorTest(10,2);
		System.out.println("a.x : "+a.x);
		System.out.println("main end");
	}

}
