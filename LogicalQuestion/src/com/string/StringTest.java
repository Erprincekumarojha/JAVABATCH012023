package com.string;

public class StringTest {

	public static void main(String[] args) {

		String str = "java is awesome";
		System.out.println(str);
		String output = reverseStringWithoutChangePositionOfWord(str);
		System.out.println(output);
	}

	public static String reverse(String str) {
		String temp = ""; // java
		for (int i = str.length() - 1; i >= 0; i--) {
			temp = temp + str.charAt(i); // avaj
		}
		return temp;
	}

	private static String reverseStringWithoutChangePositionOfWord(String str) {
		String[] split = str.split(" ");
		String output = "";
		for (int i = 0; i < split.length; i++) {
			String s = split[i];
			s = reverse(s);
			output = output + s+ " ";
		}
		return output;
	}

}
