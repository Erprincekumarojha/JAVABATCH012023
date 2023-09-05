package com.app;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {

	Map<Integer, User> userMap = new HashMap<>();

	public User getUserById(int userId) {
		return userMap.get(userId);
	}

	public void addUser(User user) {
		userMap.put(user.getUserId(), user);
	}

}
