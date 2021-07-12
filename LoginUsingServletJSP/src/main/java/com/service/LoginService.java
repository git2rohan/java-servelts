package com.service;

import com.DOA.DOA;
import com.POJO.User;

public class LoginService {
	
	public User checkLogin(String username, String password)
	{
		User user = new DOA().checkLogin();
		
		if(username.equals(user.getUsername()) && password.equals(user.getPassword()))
			return user;
		else
			return null;
		
	}

}
