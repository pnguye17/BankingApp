package com.peter.model;

import java.io.Serializable;
import java.util.Objects;

public class Account implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7012542252105783222L;
	private long accountId;
	private double balance;
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public int hashCode() {
		return Objects.hash(accountId, balance);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return accountId == other.accountId
				&& Double.doubleToLongBits(balance) == Double.doubleToLongBits(other.balance);
	}
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", balance=" + balance + "]";
	}
	public Account(long accountId, double balance) {
		super();
		this.accountId = accountId;
		this.balance = balance;
	}
	
	

}
