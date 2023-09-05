package com.app;

class PrintDetails<T>{

	// if you go with Object then type is required
	
	public static <G> void printData(G[] values) { 
		for(G s: values) {
			System.out.println(s);
		}
	}
	
}
public class TestMethodG {
	
	public static void main(String[] args) {
		
		String country[] = {"INDIA","US","JAPAN","PAKIATAN"};
		PrintDetails.printData(country);
		
		Integer arr[] = {100,200,300};
		PrintDetails.printData(arr); //Error
		
		
	}
}
