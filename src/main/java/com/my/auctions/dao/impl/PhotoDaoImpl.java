package com.my.auctions.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.my.auctions.dao.PhotoDao;
import com.my.auctions.model.Photo;

@Repository
public class PhotoDaoImpl implements PhotoDao {
	
	private static final String SQL_ADD_PHOTO = "INSERT INTO Photos (userId, photo) values (?, ?);";
	private static final String SQL_DELETE_PHOTO = "DELETE FROM Photos WHERE id=?;";
	private static final String SQL_GET_PHOTOS_BY_USER = "SELECT * FROM Photos WHERE userId=?;";
	
	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	@Override
	public void add(Photo photo) {
		KeyHolder keyHolder = new GeneratedKeyHolder();
		jdbcTemplate.update(new PreparedStatementCreator() {

			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement ps = con.prepareStatement(SQL_ADD_PHOTO, new String[] { "id" });
				ps.setInt(1, photo.getUser().getId());
				ps.setBlob(2, photo.getPhoto());
				return ps;
			}
			
		}, keyHolder);	
		photo.setId(keyHolder.getKey().intValue());
	}

	@Override
	public void delete(int idPhoto) {
		jdbcTemplate.update(SQL_DELETE_PHOTO, idPhoto);
	}

	@Override
	public ArrayList<Photo> getAllByUser(int idUser) {
		// TODO Auto-generated method stub
		return null;
	}

}
