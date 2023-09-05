package com.app;

import java.util.ArrayList;
import java.util.Arrays;

public class GenericTest {
	
	public static void main(String[] args) {
		
		String [] arr = new String[3];
		arr[0] = "Hello";
		arr[2]= "Hi";
		//arr[1] = 21; //CE it's type safe of String only
		System.out.println(Arrays.toString(arr));
		
		ArrayList<String> a = new ArrayList<>();
		a.add("Hello");
		//a.add(23); // this is not type safe it will store any value
		System.out.println(a);
	}

}
