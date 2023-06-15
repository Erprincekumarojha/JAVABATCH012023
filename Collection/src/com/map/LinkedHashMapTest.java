package com.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LinkedHashMapTest {
	
	public static void main(String[] args) {
		
		Map<String, String> lhm = new TreeMap<>();
		lhm.put("prince", "123");
		lhm.put("a", "123");
		lhm.put("b", "123");
		lhm.put("acc", "123");
		lhm.put("s", "123");
		lhm.put("24", null);
		lhm.put("21", null);
		
		System.out.println(lhm);
	
	}

}
