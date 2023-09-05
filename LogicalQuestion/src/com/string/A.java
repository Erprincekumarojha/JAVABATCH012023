package com.string;

public class A {
	
	//16. How to find the first non-repeating character in a given String?
	public static void main(String[] args) {
		
		String s = "abcabcd";
		char ch='0';
		boolean status = false;
		for (int i = 0; i < s.length(); i++) {	
			ch = s.charAt(i);
			status = false;
			for (int j = 0; j < s.length(); j++) {
				
				if(i!=j && ch==s.charAt(j)) {
				   status = true;
				   break;
				}
			}
			
			if(!status) {
				System.out.println("Non- repetated char : "+ch);
				break;
			}
		}
		
		if(status) {
			System.out.println("All char are repeted");
		}
	}

}
