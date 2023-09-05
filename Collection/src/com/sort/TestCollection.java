package com.sort;

import java.util.Set;
import java.util.TreeSet;

public class TestCollection {

	
	public static void main(String[] args) {
		
		Set<Integer> set = new TreeSet<>();
		set.add(10);
		set.add(5);
		set.add(3);
		set.add(8);
		
		System.out.println(set);
	}
}
