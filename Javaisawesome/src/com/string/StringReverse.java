package com.string;

public class StringReverse {
	
	public static void main(String[] args) {
	
		String s = "java is awesome"; // time com: o(n)
		
		for (int i=s.length()-1 ; i>=0; i--) {
			
			char charAt = s.charAt(i);
			System.out.print(charAt);
		}
		
	}

}
