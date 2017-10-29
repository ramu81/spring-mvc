package edu.chinna.kadira.springmvc.dao;

import edu.chinna.kadira.springmvc.model.Login;
import edu.chinna.kadira.springmvc.model.User;

public interface UserDao {
	
	void register(User user);

	User validateUser(Login login);
}
