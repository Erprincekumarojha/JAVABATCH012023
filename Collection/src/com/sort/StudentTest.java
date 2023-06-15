package com.sort;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class StudentTest {

	public static void main(String[] args) {
		// create Student list
		Set<Student> students = new TreeSet<>();
		// Created multiple Student object
		Student s1 = new Student(101, "prince", 24);
		Student s2 = new Student(102, "ajay", 21);
		Student s3 = new Student(103, "deeapk", 67);
		// Add student object in list
		Collections.addAll(students, s1, s2, s3);

		// print all students list
		for (Student s : students) {
			System.out.println(s.toString());
		}

		// Write sorting code to sort Student list based on name of student
		// we are going to write sorting with the help of Comparable interface
        
		//Collections.so
		
        System.out.println("\n\nAfter Soring\n\n");
		// print all students list
		for (Student s : students) {
			System.out.println(s.toString());
		}

	}

}
