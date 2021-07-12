package com.DOA;

import com.POJO.User;
import com.database.MockDatabase;

public class DOA {
	
	public User checkLogin()
	{
		MockDatabase mockDB = new MockDatabase();
		return mockDB.getUser();
	}

}
