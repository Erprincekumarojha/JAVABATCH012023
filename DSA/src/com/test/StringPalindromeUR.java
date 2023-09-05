package com.test;

public class StringPalindromeUR {

	public static void main(String[] args) {

		String s = "madsm";
		boolean status = palindromeCheck(s, 0, s.length());
		if (status) {
			System.out.println("palindrome");
		} else {
			System.out.println("Not palindrome");
		}
	}

	private static boolean palindromeCheck(String s, int i, int size) {
		if (i >= size / 2) {
			return true;
		}
		if (s.charAt(i) != s.charAt(size - 1)) {
			return false;
		}
		return palindromeCheck(s, i + 1, size - 1 - i);
	}

}
