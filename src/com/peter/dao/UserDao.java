package com.peter.dao;

import com.peter.model.User;

public interface UserDao {
	
	public User createUser(User user);
	public User getUser(User user);
	
}
