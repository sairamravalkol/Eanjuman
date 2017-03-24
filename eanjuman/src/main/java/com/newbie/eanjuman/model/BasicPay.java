package com.newbie.eanjuman.model;

import java.util.HashSet;
import java.util.Set;

public class BasicPay {
	private Integer basicPayId;
	private Double BasicPay;
	private Set<MonthlyPayment> monthlyPayments = new  HashSet<MonthlyPayment>();
		
	public Set<MonthlyPayment> getMonthlyPayments() {
		return monthlyPayments;
	}
	public void setMonthlyPayments(Set<MonthlyPayment> monthlyPayments) {
		this.monthlyPayments = monthlyPayments;
	}
	public Integer getBasicPayId() {
		return basicPayId;
	}
	public void setBasicPayId(Integer basicPayId) {
		this.basicPayId = basicPayId;
	}
	public Double getBasicPay() {
		return BasicPay;
	}
	public void setBasicPay(Double basicPay) {
		BasicPay = basicPay;
	}
	@Override
	public String toString() {
		return "BasicPay [basicPayId=" + basicPayId + ", BasicPay=" + BasicPay + ", monthlyPayments=" + monthlyPayments
				+ "]";
	}
	

}
