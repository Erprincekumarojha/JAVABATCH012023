package com.string;

public class Test {
	// 5. Write a program to count the character in given String
	public static void main(String[] args) {
		String s = "awesome java wrt  wer";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
                 count++;
			}
		}
		System.out.println("Character Count : " + count);
	}

}
