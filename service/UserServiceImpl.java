package mvc_mysql.service;

import org.springframework.beans.factory.annotation.Autowired;

import mvc_mysql.dao.UserDao;
import mvc_mysql.model.Login;
import mvc_mysql.model.User;

public class UserServiceImpl implements UserService{
	@Autowired
	UserDao userdao;
	
	public void register(User user) {
		userdao.register(user);	
	}

	public User validateUser(Login login) {	
		return userdao.validateUser(login);
	}

	

}
