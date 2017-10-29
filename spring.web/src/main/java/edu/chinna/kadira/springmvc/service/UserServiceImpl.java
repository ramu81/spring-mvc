package edu.chinna.kadira.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;

import edu.chinna.kadira.springmvc.dao.UserDao;
import edu.chinna.kadira.springmvc.model.Login;
import edu.chinna.kadira.springmvc.model.User;

public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;

	public User validateUser(Login login) {
		return userDao.validateUser(login);
	}

	public void register(User user) {
		System.out.println(" "+user);
		userDao.register(user);
	}

}
