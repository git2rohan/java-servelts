package com.database;

import com.POJO.User;

public class MockDatabase {
	
	
	public User getUser()
	{
		User user = new User();
		user.setUsername("rohan");
		user.setPassword("rohan");
		user.setName("Rohan Soudey");
		return user;
	}
	
	

}
