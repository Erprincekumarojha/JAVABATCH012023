package com.map;

import java.util.HashMap;

public class InternalWorkingOfHashMap {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<>();//capacity - 16, load factor- 0.75%
		//we have store some data in hashmap then loadfactor will reach 0.75 then automatically
		// capicity*2 increement.
		//12 eleemt then capicity; 32.  64,   128, 256
		//HashMap<Integer, String> hm1 = new HashMap<>(2, 0.25f);
		hm.put("vishal", 123);
		
		
		
	}

}
