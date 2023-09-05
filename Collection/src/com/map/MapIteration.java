package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapIteration {
	
	public static void main(String[] args) {
		
		Map<Integer, String> students  = new HashMap<>();
		students.put(1, "prince");
		students.put(2, "deepak");
		students.put(3, "avinash");
		students.put(4, "ajay");
		students.put(5, "soun");
		students.put(6, "adit");
		
	    // store all key of map in one collection
		Set<Integer>  studentsId = students.keySet();
		Collection<String> values = students.values();
		for(Integer i : studentsId) {
			System.out.println(i+ " - "+students.get(i));
		}
		System.out.println(studentsId);
		System.out.println(values);
	}

}
