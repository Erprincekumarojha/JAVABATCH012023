package com.app;

import java.util.List;

public class UnBoundedWhileCard {

	//unboundedwildcard
	public static void printData(List<?> list) {
		
		for(Object obj : list) {
			System.out.println(obj);
		}
	}
	
	//UpperboundedwildCard
	public static double sum(List<? extends Number> list) {
	    double sum = 0;
		for(Number obj : list) {
			sum = sum+ obj.doubleValue();
		}
		return sum;
	}
	
	//lowerBoundedWildCard
	public static void printNumber(List<? super Integer> list) {
	
		 for(Object obj : list) {
			 System.out.println(obj);
		 }
	}
	
	public static void main(String[] args) {
		List<Integer> list1 = List.of(1,2,3,4);
		printNumber(list1);
		//List<> list5 = List.of(1,2,3,4);
		//printNumber(list5);
		
		
		
		double sum = sum(list1);
		//System.out.println(sum);
		List<Double> list3 = List.of(100.6,300.5);
		//System.out.println(sum(list3));
		
		//if you pass object type it will not work
		List<Object> list4  = List.of(2,3,4);
		//System.out.println(sum(list4));
		//printData(list1);
		
		List<String> list2 = List.of("java","python","php");
		//printData(list2);
	}
}
