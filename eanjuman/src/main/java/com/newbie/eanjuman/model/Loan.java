package com.newbie.eanjuman.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Loan {
	private Integer loanId;
	private Double loanAmount;
	private Interest interest;
	private Date issuedDate;
	private Double loanLimit;
	
	private AccountHolder accountHolder;
	
	private Set<MonthlyPayment> monthlyPayments = new HashSet<MonthlyPayment>();
	
	
	
	

	public Set<MonthlyPayment> getMonthlyPayments() {
		return monthlyPayments;
	}
	public void setMonthlyPayments(Set<MonthlyPayment> monthlyPayments) {
		this.monthlyPayments = monthlyPayments;
	}
	public AccountHolder getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(AccountHolder accountHolder) {
		this.accountHolder = accountHolder;
	}
	public Integer getLoanId() {
		return loanId;
	}
	public void setLoanId(Integer loanId) {
		this.loanId = loanId;
	}
	public Double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(Double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public Interest getInterest() {
		return interest;
	}
	public void setInterest(Interest interest) {
		this.interest = interest;
	}
	public Date getIssuedDate() {
		return issuedDate;
	}
	public void setIssuedDate(Date issuedDate) {
		this.issuedDate = issuedDate;
	}
	public Double getLoanLimit() {
		return loanLimit;
	}
	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}	
	
}
