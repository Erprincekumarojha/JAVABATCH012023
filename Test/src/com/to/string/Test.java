package com.to.string;

class Person{
	
	private int id;
	private String name;
	private int age;
	
	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
public class Test {

	public static void main(String[] args) {
		
		Person p = new Person(101, "prince", 25);
		//without implementing toString method in our class
		//com.to.string.Person@626b2d4a
		System.out.println(p.toString());
		
		//after ovrriding the toString method
		//Person [id=101, name=prince, age=25]

	}
}
