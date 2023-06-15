package com.studentmanagement;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentUtility {
	static Scanner sc = new Scanner(System.in);
	// 1. Add student
	public static Student addStudent() {
		
		Student s = new Student();
		System.out.print("Please enter StudentId : ");
		s.setsId(sc.nextInt());
		System.out.print("Please enter StudentName: ");
		s.setSname(sc.next());
		System.out.print("Please enter StudentAge : ");
		s.setAge(sc.nextInt());
		return s;
	}

	// 2. Update student
	   public static void updateStudent(List<Student> students) {
		   System.out.println("Please enter the Update Details:");
		   System.out.print("Enter SId:");
		   int id = sc.nextInt();
		   System.out.print("Enter Sname:");
		   String name = sc.next();
		   System.out.print("Enter SAge: ");
		   int age = sc.nextInt();
		   
		   // Done the Changes in Acutal Student List
		   int count = 0;
		   for(Student s : students) {
			 if(id == s.getsId()) {
				break;
			 }
			 count++;
		   }
		   students.get(count).setSname(name);
		   students.get(count).setAge(age);
		 
	   }

	// 3. Display Student
	 public static void dispalyAllStudent(List<Student> students) {
		
		 Iterator<Student> studentIterator = students.iterator();
		 while(studentIterator.hasNext()) {
			 System.out.println(studentIterator.next().toString());
		 }
	 }

	// 4. Delete Student
	 
	 public static void deleteStudent(List<Student> students, int sid) {
		 Iterator<Student> studentIterator = students.iterator();
		 while(studentIterator.hasNext()) {
			 Student s = studentIterator.next();			 
			 if(s.getsId()==sid) {
				 studentIterator.remove();
			 }
		 }
	 }

}
