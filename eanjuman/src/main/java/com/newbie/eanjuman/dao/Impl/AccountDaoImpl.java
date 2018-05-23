package com.newbie.eanjuman.dao.Impl;

import java.io.Serializable;
import java.util.List;


import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.newbie.eanjuman.dao.AccountDao;
import com.newbie.eanjuman.model.AccountHolder;

@SuppressWarnings("deprecation")
public class AccountDaoImpl extends HibernateDaoSupport implements AccountDao {

	
	
	@Override
	public AccountHolder findById(Integer accountId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int add(AccountHolder account) {
	Serializable serializable = getHibernateTemplate().save(account);
		return  (int) serializable;
	}

	@Override
	public int update(AccountHolder account) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(AccountHolder account) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<AccountHolder> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
