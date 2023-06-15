package com.basic;

import java.util.ArrayList;

public class CollectionMethod {

	public static void main(String[] args) {

		ArrayList a1 = new ArrayList<>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		
		ArrayList a2 = new ArrayList<>();
		a2.add(10);
		a2.add(20);
		a2.add(31);
         
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		
		 boolean equals = a1.equals(a2);
		if (equals) {
			System.out.println("Collection is equal");
		} else {
			System.out.println("Collection is Not equal");
		}

	}

}
