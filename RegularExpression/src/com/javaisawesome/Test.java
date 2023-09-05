package com.javaisawesome;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {

		String email1 = "02-08-2023";
		String email2 = "2012-202-02";
		String email3 = "2023-12-02";

		// java provides us one class called Pattern compile()
		Pattern p = Pattern.compile("\\b\\d{4}-\\d{2}-\\d{2}\\b");
		System.out.println(p.matcher(email1).matches());
		System.out.println(p.matcher(email2).matches());

		System.out.println(p.matcher(email3).matches());
	}

}
