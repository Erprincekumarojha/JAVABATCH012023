package com.app;

public class UserService {

	private UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public void addUser(User user) {
		if (userRepository != null) {
			userRepository.addUser(user);
		}
	}
	
	public User getUserById(int userId) {
		return userRepository.getUserById(userId);
	}

}
