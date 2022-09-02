package com.peter.dao;

import com.peter.model.Account;

public interface AccountDao {
	
	public Account getAccountById(Account account);
	public int deposit(Account account);
	public int withdrawal(Account account);

}
