package com.mulodo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {

		User user = new User();

		user.setId(rs.getInt(1));
		user.setUsername(rs.getString(2));
		user.setPassword(rs.getString(3));
		user.setAge(rs.getInt(4));

		return user;
	}

}