package com.string;

import java.util.HashMap;
import java.util.Map;

public class FindCharFreq {

	public static void main(String[] args) {

		String str = "java is awesomejjjjjj";
		str = str.toLowerCase();
		
		int count = 0;
		char output = 0 ;
		
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch , map.containsKey(ch) ? map.get(ch)+1 : 1);
            
            if(count<map.get(ch)) {
				count = map.get(ch);
				output  = ch;
			}
		}
		
		System.out.println(map);
		System.out.println("Maximum Time Occure Char : "+output);

	}

}
