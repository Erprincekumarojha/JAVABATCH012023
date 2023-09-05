package com.methodref;

import java.util.function.Function;

class Student{
	private String name;
	public Student(String s){
		this.name = s;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class ConstructorRefTest {

	public static void main(String[] args) {
		
		Function<String, Student> fun = Student :: new;
		Student s = fun.apply("Very nice");
		System.out.println(s.getName());
		
		
	}
}
