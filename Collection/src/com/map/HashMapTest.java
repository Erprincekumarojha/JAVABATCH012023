package com.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapTest {
	
	public static void main(String[] args) {
		//genetic provides to store data in type safe manner in collection
		Map<Integer, String> m =  new HashMap<>();
		//store data in map we can use put() method
		//m.put("pk", "234");
		m.put(123, "java");
		//m.put(1.45543, true);
		//m.put("a", 3435);
		m.put(12, "prince");
		//print all hashmap data
		System.out.println(m);
		
		//let me fetch 123 value.
		String string = m.get(123);
		System.out.println(string);
	}

}
