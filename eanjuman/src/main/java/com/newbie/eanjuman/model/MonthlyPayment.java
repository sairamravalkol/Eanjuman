package com.newbie.eanjuman.model;

import java.sql.Timestamp;

public class MonthlyPayment {
	private Integer paymentId;
	private Double TotalAmount;
	private Timestamp paymentDate;
	private Timestamp lastUpdate;
	
	private BasicPay basicPay;
	private Loan loan;
	private AccountHolder accountHolder;
	
		
	public Timestamp getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Timestamp paymentDate) {
		this.paymentDate = paymentDate;
	}
	public Timestamp getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	public AccountHolder getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(AccountHolder accountHolder) {
		this.accountHolder = accountHolder;
	}
	public Integer getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}
	public Double getTotalAmount() {
		return TotalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		TotalAmount = totalAmount;
	}
	public BasicPay getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(BasicPay basicPay) {
		this.basicPay = basicPay;
	}
	public Loan getLoan() {
		return loan;
	}
	public void setLoan(Loan loan) {
		this.loan = loan;
	}
	@Override
	public String toString() {
		return "MonthlyPayment [paymentId=" + paymentId + ", TotalAmount=" + TotalAmount + ", basicPay=" + basicPay
				+ ", loan=" + loan + ", accountHolder=" + accountHolder + ", paymentDate=" + paymentDate
				+ ", lastUpdate=" + lastUpdate + "]";
	}
	
	

}
