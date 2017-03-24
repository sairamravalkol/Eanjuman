package com.newbie.eanjuman.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

public class User {
	private Integer userId;
	private String firstName;
	private String lastName;
	private String password;
	private String phone;
	private String email;
	private Timestamp dateOfCreate;
	private Boolean active;
	private Timestamp lastupdate;
	
	private Set<AccountHolder> accountHolders = new HashSet<AccountHolder>();
	

	
	public Set<AccountHolder> getAccountHolders() {
		return accountHolders;
	}


	public void setAccountHolders(Set<AccountHolder> accountHolders) {
		this.accountHolders = accountHolders;
	}


	public User() {
		//Default constructor
	}


	public Integer getUserId() {
		return userId;
	}


	public void setUserId(Integer userId) {
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


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	


	public Boolean getActive() {
		return active;
	}


	public void setActive(Boolean active) {
		this.active = active;
	}


	public Timestamp getDateOfCreate() {
		return dateOfCreate;
	}


	public void setDateOfCreate(Timestamp dateOfCreate) {
		this.dateOfCreate = dateOfCreate;
	}


	public Timestamp getLastupdate() {
		return lastupdate;
	}


	public void setLastupdate(Timestamp lastupdate) {
		this.lastupdate = lastupdate;
	}


	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", password="
				+ password + ", phone=" + phone + ", email=" + email + ", dateOfCreate=" + dateOfCreate + ", active="
				+ active + ", lastupdate=" + lastupdate + "]";
	}


	
}