package com.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.entity.User;

public class InMemoryUserRepository implements UserRepository {

	Map<Long, User> userMap = new HashMap<>(); // DB

	@Override
	public void save(User user) {

		userMap.put(user.getUserId(), user);

	}

	@Override
	public User findById(Long userId) {

		return userMap.get(userId);
	}

	@Override
	public List<User> findAll() {

		return new ArrayList<>(userMap.values());
	}

	@Override
	public void update(Long userId, User user) {
		userMap.put(userId, user);

	}

	@Override
	public void delete(Long userId) {

		userMap.remove(userId);

	}

}
