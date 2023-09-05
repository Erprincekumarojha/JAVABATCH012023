package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StudentTest {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();
		// 5 student data
		Student s1 = new Student("Sumit", 45);
		Student s2 = new Student("Ajit", 34);
		Student s3 = new Student("Rahul", 23);
		Student s4 = new Student("Ajay", 60);
		Student s5 = new Student("Sonu", 12);
		//add all 5 student in list
		students =  List.of(s1,s2,s3,s4,s5);
	    //sort all the Student Data
		//Collections.sort(students); it will not support for user-defined class data sort
		//Collections.sort(students, new Student(null, 0));
		
		//print all Student based on name
		for(Student s : students) {
			System.out.println(s.getName());
		}
		
		
	}

}
