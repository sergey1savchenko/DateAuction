package com.my.security.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.my.security.model.UserAuth;

@Repository
public class UserDaoImpl{
    
    private static final String SQL_SELECT_USER_AUTH_BY_EMAIL = "SELECT users.id, users.email, users.password, roles.role FROM users INNER JOIN roles ON users.id_role=roles.id WHERE users.email=?";

    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    public UserAuth getUserAuth(String email) {
	List<UserAuth> list = jdbcTemplate.query(SQL_SELECT_USER_AUTH_BY_EMAIL, new RowMapper<UserAuth>() {
	    
	    @Override
	    public UserAuth mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new UserAuth(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
	    }
	}, email);
	return list.isEmpty() ? null : list.get(0);
    }
}
