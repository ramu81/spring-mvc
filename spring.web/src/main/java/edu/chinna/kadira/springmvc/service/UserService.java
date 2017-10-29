package edu.chinna.kadira.springmvc.service;

import edu.chinna.kadira.springmvc.model.Login;
import edu.chinna.kadira.springmvc.model.User;

public interface UserService {
	
	User validateUser(Login login);

	void register(User user);
}
