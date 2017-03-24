package com.newbie.eanjuman.model;

import java.util.HashSet;
import java.util.Set;

public class Interest {
	private Integer interestId;
	private Double interestRate;
	private Set<Loan> loans = new HashSet<Loan>();
	
	public Set<Loan> getLoans() {
		return loans;
	}
	public void setLoans(Set<Loan> loans) {
		this.loans = loans;
	}
	public Integer getInterestId() {
		return interestId;
	}
	public void setInterestId(Integer interestId) {
		this.interestId = interestId;
	}
	public Double getInterestRate() {
		return interestRate;
	}
	
	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	@Override
	public String toString() {
		return "Interest [interestId=" + interestId + ", interestRate=" + interestRate + "]";
	}

}
