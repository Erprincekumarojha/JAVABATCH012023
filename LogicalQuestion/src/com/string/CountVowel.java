package com.string;

public class CountVowel {
	
	public static void main(String[] args) {
		
		String str = "java is awesome"; // a e i o u
		int vcount = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
		      if(ch=='a' || ch == 'e' || ch == 'i' || ch =='o' || ch == 'u') {
		    	  vcount++;
		      }
		}
		
		System.out.println("Vowel Count : "+vcount);
	}

}
