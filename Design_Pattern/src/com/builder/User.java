package com.builder;

public class User {
	
	private int userId;
	private String name;
	private String email;
	
	private User(UserBuilder builder) {
		//initilized our object
		this.userId = builder.userId;
		this.name = builder.name;
		this.email = builder.email;
	}

	public int getUserId() {
		return userId;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", email=" + email + "]";
	}
	
	//Create on Static Builder class
	static class UserBuilder{
		private int userId;
		private String name;
		private String email;
		
		public UserBuilder() {
			
		}

		public UserBuilder setUserId(int userId) {
			this.userId = userId;
			return this;
		}

		public UserBuilder setName(String name) {
			this.name = name;
			return this;
		}

		public UserBuilder setEmail(String email) {
			this.email = email;
			return this;
		}
		
		//create one build() method
		public User build() {
			User user = new User(this);
			return user;
		}
		
	}

}
