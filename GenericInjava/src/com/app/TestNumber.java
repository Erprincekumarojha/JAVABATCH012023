package com.app;

class PrintData<T extends Number>{
         // it will only support Number sub class(T)
	public void printData(T[] valueData) {
		for(T t: valueData) {
			System.out.println(t);
		}
	}
}
public class TestNumber {

	public static void main(String[] args) {
		PrintData<Number> p1 = new PrintData();
		
		Integer arr[] = {100,200,300};
		p1.printData(arr);
		Double arr2[] = {100.2,200.5,300.35};
		p1.printData(arr2);
		
		
	}
}
