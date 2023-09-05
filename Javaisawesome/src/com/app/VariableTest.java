package com.app;

public class VariableTest {
	
	int a = 10; // instance variable // it particular of object
	static int b= 20; // class variable  // it common for all object
	
	public static void main(String[] args) {
		
		int a = 20; // local variable
		System.out.println(a);
		
		VariableTest t1 = new VariableTest();
		t1.a = 2000;
		VariableTest t2 = new VariableTest();
		t2.a = 30;
		VariableTest t3 = new VariableTest();
		t1.b = 100;
		
		System.out.println("a : "+t1.a + ", b : "+t1.b);
		System.out.println("a : "+t2.a + ", b : "+t2.b);
		System.out.println("a : "+t3.a + ", b : "+t3.b);
		
	}
	
	int w = 30;
	
	static int d =30;
	
	public void m1() {
		int a = 20; // local variable
	}

}
