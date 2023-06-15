package com.student;

public class StudentTest {

	public static void main(String[] args) {

	   Student str[] =  StudentService.takeStudentDetails();
	   
	   StudentService.displayAllStudent(str);
	}
}
