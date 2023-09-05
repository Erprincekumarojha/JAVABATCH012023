package com.string;

public class RotationOfTwoString {
	
	public static void main(String[] args) {
		
		String s1 = "abcd"; //abcd
		String s2 = "dcab"; // abcd
		if(s1.length()!=s2.length()) {
			System.out.println("s2 is not a rotation of s1");
			System.exit(0);
		}
		boolean status = checkRotation(s1,s2);
		
		if(status) {
		   System.out.println("s2 is roation of s1");	
		}else {
			  System.out.println("s2 is not roation of s1");	
		}
		
	}

	private static boolean checkRotation(String s1, String s2) {
	
		String temp  = s1+s1; // abcd abcd
		if(temp.indexOf(s2)!=-1) { // cdab
			return true;
		}
		return false;
	}

}
