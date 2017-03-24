package com.newbie.eanjuman.model;

import java.util.HashSet;
import java.util.Set;

public class Security {
	private String securityId;
	private String securityName;
	private Boolean active;
	private Set<AccountHolder> accountHolders = new HashSet<AccountHolder>();
	
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public String getSecurityId() {
		return securityId;
	}
	public void setSecurityId(String securityId) {
		this.securityId = securityId;
	}
	public Set<AccountHolder> getAccountHolders() {
		return accountHolders;
	}
	public void setAccountHolders(Set<AccountHolder> accountHolders) {
		this.accountHolders = accountHolders;
	}
	public String getSecurityName() {
		return securityName;
	}
	public void setSecurityName(String securityName) {
		this.securityName = securityName;
	}
	
	

}
