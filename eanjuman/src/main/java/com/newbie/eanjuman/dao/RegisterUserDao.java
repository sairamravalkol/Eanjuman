package com.newbie.eanjuman.dao;

import java.util.List;
import com.newbie.eanjuman.model.User;

public interface RegisterUserDao {
		
	public User findUserById(Integer userId);
	public int addUser(User user);
	public int update(User user);
	public int delete(Integer userId);
	public List<User> findAllUsers();

}
