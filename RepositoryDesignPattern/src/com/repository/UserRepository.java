package com.repository;

import java.util.List;

import com.entity.User;

public interface UserRepository {
	
	void save(User user);
	User findById(Long userId);
	List<User> findAll();
	void update(Long userId, User user);
	void delete(Long userId);

}
