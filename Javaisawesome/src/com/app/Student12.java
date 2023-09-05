package com.app;

public class Student12 {
	
	static int i; // associated with class
	int j = 0;  // associated with instance
	
	public static void main(String[] args) {
		
		System.out.println(i);
		
		Student12 s = new Student12();
		System.out.println(s.j);
	
	}

}
