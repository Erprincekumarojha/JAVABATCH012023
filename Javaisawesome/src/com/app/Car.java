package com.app;

public class Car {
	
	int carId;
	String carName;
	String carColor;
	double carPrise;
	
	public static void main(String[] args) {
	
		Car c1 = new Car(); // instance
		Car c2 = new Car();
		Car c3 = new Car();
		Car c4 = new Car();
		
		c1 = null;
		
		System.gc(); // GC , it's remove unreferenced object memory from Heap area
		
		
	}
	

}
