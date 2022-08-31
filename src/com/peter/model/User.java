package com.peter.model;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9206670623893302989L;
	private long userId;
	private String firstName;
	private String lastName;
	private Account account;
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	@Override
	public int hashCode() {
		return Objects.hash(account, firstName, lastName, userId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(account, other.account) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName) && userId == other.userId;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", account=" + account
				+ "]";
	}
	public User(long userId, String firstName, String lastName, Account account) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.account = account;
	}
	
	

}
