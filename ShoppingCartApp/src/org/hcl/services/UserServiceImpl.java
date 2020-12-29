package org.hcl.services;

import java.util.Optional;

import org.hcl.dao.UserDao;
import org.hcl.dao.UserDaoImpl;
import org.hcl.model.User;

public class UserServiceImpl implements UserService {
	UserDao userdao = new UserDaoImpl();

	@Override
	public boolean register(User user) {
		boolean b = false;
		if(user!= null) {
			b = userdao.insert(user);
		}
		return b;
	}

	@Override
	public boolean validate(User user) {
		boolean b = false;
		if(user!= null) {
			b = userdao.validate(user);
		}
		return b;
	}
	@Override
	public Optional<User> getUserByUsername(String username) {
		return userdao.getUserByUsername(username);
	}

}
