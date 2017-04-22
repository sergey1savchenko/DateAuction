package com.my.auctions.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.my.auctions.dao.UserDao;
import com.my.auctions.model.User;
import com.my.auctions.model.UserAuth;

@Repository
public class UserDaoImpl implements UserDao{
    
	private static final String SQL_ADD_USER = "INSERT INTO Users "
			+ "(email, password, name, city, country, sex, bio, birthYear, profilePhoto, roleId) "
			+ "values (?, ?, ?, ?, ?, ?, ?, ?, ?, 2);";
	private static final String SQL_UPDATE_USER = "UPDATE Users SET email=?, password=?, name=?, city=?, "
			+ "country=?, sex=?, bio=?, birthYear=?, profilePhoto=?, roleId=2 WHERE id=?;";
	private static final String SQL_DELETE_USER = "DELETE FROM Users WHERE id=?;";
	private static final String SQL_GET_USER_BY_ID = "SELECT * FROM Users WHERE id=?;";
    private static final String SQL_SELECT_USER_AUTH_BY_EMAIL = "SELECT Users.id, Users.email, Users.password, Roles.role "+
    											"FROM Users INNER JOIN Roles ON Users.roleId=Roles.id WHERE Users.email=?;";

    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    /* (non-Javadoc)
	 * @see com.my.auctions.dao.impl.UserDao#getUserAuth(java.lang.String)
	 */
    @Override
	public UserAuth getUserAuth(String email) {
	List<UserAuth> list = jdbcTemplate.query(SQL_SELECT_USER_AUTH_BY_EMAIL, new RowMapper<UserAuth>() {
	    
	    @Override
	    public UserAuth mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new UserAuth(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
	    }
	}, email);
	return list.isEmpty() ? null : list.get(0);
    }

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int idUser) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getById(int idUser) {
		// TODO Auto-generated method stub
		return null;
	}

}
