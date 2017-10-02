package yzq.com.service;

import yzq.com.dao.UserDao;
import yzq.com.dao.UserDaoImple;
import yzq.com.vo.User;

public class UserService {

	public User login(User user) {
		UserDao dao = new UserDaoImple();
		return dao.login(user);
	}

}
