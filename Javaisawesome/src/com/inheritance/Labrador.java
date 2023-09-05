package com.inheritance;

class A extends Object{
	public A() {
		super();
		System.out.println("A");
	}
	
}
class Animal extends A {
	protected String name;
	protected String color;
	public Animal() {
		super();
		System.out.println("Animal");
	}
	public void eat() {
		System.out.println("Animal is eating");
	}
}

class Dog extends Animal{
	private int dogId;
	public Dog() {
		super();
		System.out.println("Dog");
	}
    public void bark() {
    	System.out.println("Dog is Barking");
    }
}
public class Labrador extends Dog{
	
	public Labrador() {
		super();
		System.out.println("lABRATOR");
	}
	public static void main(String[] args) {
		
		Labrador l = new Labrador();
		System.out.println("object created");
		
	}

}
