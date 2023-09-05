package com.student;

import java.util.Scanner;

public class StudentService {

	//take value from user like 3 student
	public static Student[] takeStudentDetails() {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter 3 student Details:");
	  //take First Student
      Student str[]  = new Student[3];
      for (int i = 0; i < 3; i++) {
		
    	  System.out.println("Enter "+(i+1)+ " Student Data");
    	  Student s = new Student();
          System.out.print("Enter StudentId:");
          s.setId(sc.nextInt());
          System.out.print("Enter StudentName:");
          s.setName(sc.next());
          System.out.print("Enter StudentMobile:");
          s.setMobile(sc.next());
          System.out.print("Enter StudentCourse:");
          s.setCourse(sc.next());
          
          // add student in Student Array
          str[i] = s;
	}
      
    
      // create student array and add all student in array then after return s array
     
      
		return str;
	}
	
    
    // create method for display all student
	public static void displayAllStudent(Student str[]) {
		
		for (int i = 0; i < str.length; i++) {
			
			Student s  = str[i];
			
			System.out.println((i+1)+" - Student--------------");
			System.out.println("StudentId : "+s.getId());
			System.out.println("StudentName : "+s.getName());
			System.out.println("StudentMobile : "+s.getMobile());
			System.out.println("StudentCourse : "+s.getCourse());
			
		}
		
	}
	

}
