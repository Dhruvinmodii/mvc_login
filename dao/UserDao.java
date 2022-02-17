package mvc_mysql.dao;

import mvc_mysql.model.Login;
import mvc_mysql.model.User;

public interface UserDao {

	void register (User user);
	User validateUser(Login login);
	
}
