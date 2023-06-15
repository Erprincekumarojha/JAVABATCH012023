package com.string;

import java.util.HashMap;
import java.util.Map;

public class StringWordCountFreq {
	
	public static void main(String[] args) {

		String str = "java is awesome java is good";
		str = str.toLowerCase();
		String[] arr = str.split(" ");
		
		Map<String, Integer> map = new HashMap<>();
		
		for (int i = 0; i < arr.length; i++) {
             String s = arr[i];
            if(map.containsKey(s)) {
            	map.put(s, map.get(s)+1);
            }else {
            	map.put(s, 1);
            }
		}
		
		for(String c : map.keySet()) {
			System.out.println(c+ " - "+map.get(c));
		}

	}

}
