package com.java;

import java.util.Set;
import java.util.TreeSet;

public class FindUnikeWhileSortString {
	
	public static void main(String[] args) {
		
		String s1 = "avinash";
		String s2 = "satish";
		
		Set<Character> set = new TreeSet<>();
		int length = s1.length()+s2.length()-1;
		int pointer = 0;
		for(int i=0; i<length ; i++) {
		  	if(i<s1.length()) {
		  		set.add(s1.charAt(i));
		  	}else {
		  		set.add(s2.charAt(pointer));
		  		pointer++;
		  	}
		}
		
		System.out.println(set.toString().replaceAll(",", "").replace("]", "").replace("[", ""));
	}

}
