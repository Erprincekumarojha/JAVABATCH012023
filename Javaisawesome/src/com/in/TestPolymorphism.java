package com.in;

public class TestPolymorphism {

	public static void main(String[] args) {
		
		Animal a1 = new Animal();
		Animal a2 = new Dog();
		Animal a3  = new Cat();
		
		a1.makeSound();
		a2.makeSound();
		a3.makeSound();
		
		Animal a = new Animal();
		Dog d = new Dog();
		Cat c  = new Cat();
		
		a1.makeSound();
		a2.makeSound();
		a3.makeSound();
	}
}
