package com.newbie.eanjuman.dao.Impl;

import java.io.Serializable;
import java.util.List;


import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.newbie.eanjuman.dao.RegisterUserDao;
import com.newbie.eanjuman.model.User;
import com.sun.istack.internal.logging.Logger;

public class RegisterUserDaoImpl extends  HibernateDaoSupport implements RegisterUserDao {

	private static final Logger logger = Logger.getLogger(RegisterUserDaoImpl.class);
	
	
	public User findUserById(Integer userId) {
		return null;
	}

	public int addUser(User user) {
		Serializable status = getHibernateTemplate().save(user);
		return (Integer) status;
	}

	public int update(User user) {
		return 0;
	}

	public int delete(Integer userId) {
		return 0;
	}

	public List<User> findAllUsers() {
		return null;
	}

}
