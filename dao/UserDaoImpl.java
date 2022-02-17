package mvc_mysql.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.mysql.cj.protocol.Resultset;

import mvc_mysql.model.Login;
import mvc_mysql.model.User;

public class UserDaoImpl implements UserDao{
	@Autowired
	DataSource datasource;
	@Autowired
	JdbcTemplate jdbctemplate;

	public void register(User user) {
		String sql = "insert into register (name,email,pass,number,gender,hobby,course) values (?,?,?,?,?,?,?)";
		jdbctemplate.update(sql,user.getName(),user.getEmail(),user.getPass(),user.getNumber(),user.getGender(),Arrays.toString(user.getHobby()),user.getCourse());
	}
	
	public User validateUser(Login login)
	{
		String sql = "select * from register where email='"+login.getEmail()+"'";
		List<User> users = jdbctemplate.query(sql, new UserMapper());
		return users.size() > 0 ? users.get(0) : null;
		
	}
	
	class UserMapper implements RowMapper<User>
	{

		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			User user = new User();
			user.setEmail(rs.getString("email"));
			user.setPass(rs.getString("pass"));
			return user;
		}
		
	}

}
