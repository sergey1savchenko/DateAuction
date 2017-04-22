package com.my.auctions.dao.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.my.auctions.dao.ApplicationDao;
import com.my.auctions.model.Application;

@Repository
public class ApplicationDaoImpl implements ApplicationDao {
	
	private static final String SQL_ADD_APPLICATION = "INSERT INTO Applications "
			+ "(userId, aucId, note, isConsidered, isApproved) values (?, ?, ?, 0, 0);";
	private static final String SQL_UPDATE_APPLICATION  = "UPDATE Applications SET userId=?, aucId=?, note=?, "
			+ "isConsidered=?, isApproved=? WHERE id=?;";
	private static final String SQL_DELETE_APPLICATION  = "DELETE FROM Applications WHERE id=?;";
	private static final String SQL_GET_APPLICATION_BY_ID = "SELECT * FROM Applications WHERE id=?;";
    private static final String SQL_GET_APPLICATIONS_BY_AUCTION = "SELECT * FROM Applications WHERE aucId=?";

	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	@Override
	public void add(Application application) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Application application) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int idApplication) {
		// TODO Auto-generated method stub

	}

	@Override
	public Application getById(int idApplication) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Application> getAllByAuction(int idAuction) {
		// TODO Auto-generated method stub
		return null;
	}

}
