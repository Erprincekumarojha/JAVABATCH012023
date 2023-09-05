package com.app;

public class Test {
	
	public static void main(String[] args) {
		
		UserService userService = new UserService(new UserRepository());
		userService.addUser(new User(1001, "prince", "prince@gmail.com"));
		
		//read
		User user = userService.getUserById(1001);
		System.out.println(user.toString());
	}

}
