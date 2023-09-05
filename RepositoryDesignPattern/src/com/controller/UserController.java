package com.controller;

import java.util.List;

import com.entity.User;
import com.service.UserService;
import com.service.UserServiceImpl;

public class UserController {

	UserService userService = new UserServiceImpl();

	public void save(User user) {

		userService.save(user);
	}

	public User findById(Long userId) {

		return userService.findById(userId);
	}

	public List<User> findAll() {
		return userService.findAll();
	}

	public void update(Long userId, User user) {
		userService.update(userId, user);
	}

	public void delete(Long userId) {
		userService.delete(userId);
	}
}
