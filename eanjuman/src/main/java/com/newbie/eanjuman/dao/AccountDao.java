package com.newbie.eanjuman.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.newbie.eanjuman.model.AccountHolder;

@Repository
public interface AccountDao {
	
	public AccountHolder findById(Integer accountId);
	public int add(AccountHolder account);
	public int update(AccountHolder account);
	public int delete(AccountHolder account);
	public List<AccountHolder> findAll();
}
