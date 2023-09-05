package com.app;

public class Students { // blue print of real object

	int sId;
	String name;       // properties or variable
	String course;
	
	public void test() {   // Behaver of student
	  System.out.println("Student test is going on");	
	}
	
	public static void main(String[] args) {
		
		Students s1= new Students(); // instance of s1 student
		  s1.sId = 101;
		  s1.course = "java";
		  s1.name = "prince";
		Students s2= new Students();
		
		Students s3= new Students();
		
		Students s4= new Students();
		Students s5= new Students();
	}
	
}
