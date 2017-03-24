package com.newbie.eanjuman.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

public class AccountHolder {
 private String accHolderId;
 private String firstName;
 private String lastName;
 private String fatherName;
 private Boolean Active;
 private Timestamp lastUpdate;
 
 private User user;
 private Address address;
 private Security security;
 
 private Set<Loan> loans = new HashSet<Loan>();
 private Set<MonthlyPayment> monthlyPayments = new HashSet<MonthlyPayment>();
 
 
 
 
 
 
 
 

public Set<MonthlyPayment> getMonthlyPayments() {
	return monthlyPayments;
}

public void setMonthlyPayments(Set<MonthlyPayment> monthlyPayments) {
	this.monthlyPayments = monthlyPayments;
}

public Set<Loan> getLoans() {
	return loans;
}

public void setLoans(Set<Loan> loans) {
	this.loans = loans;
}

public Security getSecurity() {
	return security;
}

public void setSecurity(Security security) {
	this.security = security;
}

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

public String getAccHolderId() {
	return accHolderId;
}

public void setAccHolderId(String accHolderId) {
	this.accHolderId = accHolderId;
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

public String getFatherName() {
	return fatherName;
}

public void setFatherName(String fatherName) {
	this.fatherName = fatherName;
}

public Boolean getActive() {
	return Active;
}

public void setActive(Boolean active) {
	Active = active;
}

public Timestamp getLastUpdate() {
	return lastUpdate;
}

public void setLastUpdate(Timestamp lastUpdate) {
	this.lastUpdate = lastUpdate;
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}
 

	
}
