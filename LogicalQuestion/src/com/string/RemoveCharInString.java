package com.string;

public class RemoveCharInString {
	
	public static void main(String[] args) {
		
		String s  ="java";
		
		String output = "";
		for (int i = 0; i < s.length(); i++) {
		   if(!(s.charAt(i)=='a'))	{
			output+=s.charAt(i);   
		   }
		}
		System.out.println(output);
	}

}
