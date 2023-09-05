package com.service;

import java.util.List;

import com.entity.User;
import com.repository.InMemoryUserRepository;
import com.repository.UserRepository;

public class UserServiceImpl implements UserService {

	UserRepository repository = new InMemoryUserRepository();
	
	@Override
	public void save(User user) {
		
		repository.save(user);
	}

	@Override
	public User findById(Long userId) {
		
		return repository.findById(userId);
	}

	@Override
	public List<User> findAll() {
		return repository.findAll();
	}

	@Override
	public void update(Long userId, User user) {
		     repository.update(userId, user);
	}

	@Override
	public void delete(Long userId) {
		repository.delete(userId);
	}

}
