package com.string;

import java.util.HashSet;
import java.util.Set;

//How to remove all duplicates word from a given string?
public class RemoveDuplicateWordFromString {

	public static void main(String[] args) {
		
		String str = "javaisawesome";
		char[] arr = str.toCharArray();
		Set set  = new HashSet<>();
		Set output  = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			if(!set.add(arr[i])) {
				output.add(arr[i]);
			}
				
		}
		System.out.println("Duplicate char : "+output);
		System.out.println("Unike char : "+set);
		
	
	}
}
