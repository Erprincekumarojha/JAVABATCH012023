package com.map;

import java.util.Hashtable;

public class HashTableTest {
	
	
	public static void main(String[] args) {
		// HashTable class is thread safe so that multiple thread can access 
		//the data one by6 one only
		Hashtable<Integer, String> ht = new Hashtable<>();
		ht.put(12, "java");
		ht.put(13, "is");
		ht.put(45, "awesome");
		
		System.out.println(ht);
	}

}
