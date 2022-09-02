package com.peter.dao;

import com.peter.model.Account;

public interface AccountDao {
	
	public Account getAccountById();
	public int deposit();
	public int withdrawal();

}
