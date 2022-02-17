package mvc_mysql.service;

import mvc_mysql.model.Login;
import mvc_mysql.model.User;

public interface UserService {

	void register(User user);
	User validateUser(Login login);
	
}
