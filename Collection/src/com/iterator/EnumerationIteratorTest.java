package com.iterator;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class EnumerationIteratorTest {

	public static void main(String[] args) {

		Vector v = new Vector<>();
		v.add(10);
		v.add("java");
		v.add(50);
		v.add("is");
		v.add("awesome");
		// iterator code to traverse the vector collection
		Enumeration enumerationList = Collections.enumeration(v);
		
		while (enumerationList.hasMoreElements()) {
			
			System.out.println(enumerationList.nextElement());	
		}

	}

}
