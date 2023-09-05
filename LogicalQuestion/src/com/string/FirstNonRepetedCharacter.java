package com.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepetedCharacter {
	
	public static void main(String[] args) {
		
		String s = "aTbcabcd";
		
		Map<Character, Integer> map   = new LinkedHashMap<>();
		
		for(char ch : s.toCharArray()) {
		  map.put(ch, map.getOrDefault(ch, 0)+1);	
		}
		
		System.out.println(map);
		
		for(char ch : map.keySet()) {
			if(map.get(ch)==1) {
				System.out.println("First Non- repeted Char : "+ch);
				break;
			}
		}
	}

}
