package com.my.auctions.dao.impl;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.my.auctions.dao.UserDao;
import com.my.auctions.model.User;
import com.my.auctions.model.UserAuth;

@Repository
public class UserDaoImpl implements UserDao{
    
	private static final String SQL_ADD_USER = "INSERT INTO Users "
			+ "(email, password, name, city, country, sex, bio, birthYear, profilePhoto, roleId) "
			+ "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
	private static final String SQL_UPDATE_USER = "UPDATE Users SET email=?, password=?, name=?, city=?, "
			+ "country=?, sex=?, bio=?, birthYear=?, profilePhoto=?, roleId=? WHERE id=?;";
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
		KeyHolder keyHolder = new GeneratedKeyHolder();
		jdbcTemplate.update(new PreparedStatementCreator() {

			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement ps = con.prepareStatement(SQL_ADD_USER, new String[] { "id" });
				ps.setString(1, user.getEmail());
				ps.setString(2, getMD5(user.getPassword()));
				ps.setString(3, user.getName());
				ps.setString(4, user.getCity());
				ps.setString(5, user.getCountry());
				ps.setInt(6, user.getSex());
				ps.setString(7, user.getBio());
				ps.setInt(8, user.getBirthYear());
				ps.setBlob(9, user.getProfilePhoto());
				ps.setInt(10, 2);
				return ps;
			}
			
		}, keyHolder);	
		user.setId(keyHolder.getKey().intValue());
	}

	@Override
	public void update(User user) {
		jdbcTemplate.update(SQL_UPDATE_USER, user.getEmail(), user.getPassword(), user.getName(), user.getCity(), 
				user.getCountry(), user.getSex(), user.getBio(), user.getBirthYear(), user.getProfilePhoto(), 2, user.getId());
	}

	@Override
	public void delete(int idUser) {
		jdbcTemplate.update(SQL_DELETE_USER, idUser);
	}

	@Override
	public User getById(int idUser) {
		// TODO Auto-generated method stub
		return null;
	}
	
	//Convert String to MD5
	public static String getMD5(String data){ 
		MessageDigest messageDigest = null;
		try {
			messageDigest = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
        messageDigest.update(data.getBytes());
        byte[] digest = messageDigest.digest();
        StringBuffer sb = new StringBuffer();
        for (byte b : digest) {
            sb.append(Integer.toHexString((int) (b & 0xff)));
        }
        return sb.toString();
    }

}
