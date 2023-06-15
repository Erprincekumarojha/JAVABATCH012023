package com.sort;

import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class CollectionSort {
	
	public static void main(String[] args) {
		
		/*
		 * String arr [] = {"java", "apple", "mango","banana"};
		 * 
		 * Arrays.sort(arr);
		 * 
		 * System.out.println(Arrays.toString(arr));
		 */
		
		List<String> list = new Stack<>();
		list.add("java");
		list.add("apple");
		list.add("banana");
		
		Collections.sort(list); 
	
		
		System.out.println(list);
		
		
	}

}
