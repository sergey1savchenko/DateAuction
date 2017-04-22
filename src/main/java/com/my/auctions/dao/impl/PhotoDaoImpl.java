package com.my.auctions.dao.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
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
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int idPhoto) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<Photo> getAllByUser(int idUser) {
		// TODO Auto-generated method stub
		return null;
	}

}
