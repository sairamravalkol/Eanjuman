package com.newbie.eanjuman.service;

import java.text.ParseException;

import org.springframework.stereotype.Service;
import com.newbie.eanjuman.command.Account;
import com.newbie.eanjuman.model.AccountHolder;
import com.newbie.eanjuman.model.Address;
import com.newbie.eanjuman.model.User;
import com.newbie.eanjuman.util.DateUtil;

@Service
public class AccountService {

 

	public String save(Account account,User user) throws ParseException {
		
		Address address = new Address();
		address.setAddress(account.getAddress());
		address.setDob(DateUtil.setDateAndTime(account.getDob()));
		address.setCity(account.getCity());
		address.setPhone1(account.getPhone1());
		address.setPhone2(account.getPhone2());
		address.setLastUpdate(DateUtil.getCurrentDate());
		
		AccountHolder accountHolder = new AccountHolder();
		accountHolder.setFirstName(account.getFirstName());
		accountHolder.setLastName(account.getLastName());
		accountHolder.setFatherName(account.getFatherName());
		accountHolder.setActive(true);
		accountHolder.setAddress(address);
		accountHolder.setLastUpdate(DateUtil.getCurrentDate());
		accountHolder.setUser(user);
		
		
		return null;
		
	}

	
	
	
	

}
