package com.builder;

import java.util.Calendar;

public class Test {
	
	public static void main(String[] args) {
		
		Calendar cal = new Calendar.Builder().setFields(4).build();
		
		
		User user = new User.UserBuilder().setName("prince").build();
		System.out.println(user.toString());
	}

}
