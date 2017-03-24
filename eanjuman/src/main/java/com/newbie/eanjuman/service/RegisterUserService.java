package com.newbie.eanjuman.service;

import com.newbie.eanjuman.dao.RegisterUserDao;
import com.newbie.eanjuman.model.User;
import com.sun.istack.internal.logging.Logger;

public class RegisterUserService {
	private static final Logger logger = Logger.getLogger(RegisterUserService.class);
	
	private RegisterUserDao registerUserDao;

	public RegisterUserDao getRegisterUserDao() {
		return registerUserDao;
	}

	public void setRegisterUserDao(RegisterUserDao registerUserDao) {
		this.registerUserDao = registerUserDao;
	}
	
	public int addUser(User user) {
		
		return registerUserDao.addUser(user);
		
	}
	

}
