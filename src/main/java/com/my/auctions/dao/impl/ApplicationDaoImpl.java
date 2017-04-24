package com.my.auctions.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.my.auctions.dao.ApplicationDao;
import com.my.auctions.model.Application;

@Repository
public class ApplicationDaoImpl implements ApplicationDao {
	
	private static final String SQL_ADD_APPLICATION = "INSERT INTO Applications "
			+ "(userId, aucId, note, isConsidered, isApproved) values (?, ?, ?, ?, ?);";
	private static final String SQL_UPDATE_APPLICATION  = "UPDATE Applications SET userId=?, aucId=?, note=?, "
			+ "isConsidered=?, isApproved=? WHERE id=?;";
	private static final String SQL_DELETE_APPLICATION  = "DELETE FROM Applications WHERE id=?;";
	private static final String SQL_GET_APPLICATION_BY_ID = "SELECT * FROM Applications WHERE id=?;";
    private static final String SQL_GET_APPROVED_APPLICATIONS_BY_AUCTION = "SELECT * FROM Applications WHERE isApproved=1 AND aucId=?;";
    private static final String SQL_GET_NOT_APPROVED_APPLICATIONS = "SELECT * FROM Applications WHERE isApproved=0 ORDER BY isConsidered;";

	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	@Override
	public void add(Application application) {
		KeyHolder keyHolder = new GeneratedKeyHolder();
		jdbcTemplate.update(new PreparedStatementCreator() {

			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement ps = con.prepareStatement(SQL_ADD_APPLICATION, new String[] { "id" });
				ps.setInt(1, application.getUser().getId());
				ps.setInt(2, application.getAuction().getId());
				ps.setString(3, application.getNote());
				ps.setBoolean(4, false);
				ps.setBoolean(5, false);
				return ps;
			}
			
		}, keyHolder);	
		application.setId(keyHolder.getKey().intValue());
	}

	@Override
	public void update(Application application) {
		jdbcTemplate.update(SQL_UPDATE_APPLICATION, application.getUser().getId(), application.getAuction().getId(), 
				application.getNote(), application.isConsidered(), application.isApproved(), application.getId());
	}

	@Override
	public void delete(int idApplication) {
		jdbcTemplate.update(SQL_DELETE_APPLICATION, idApplication);
	}

	@Override
	public Application getById(int idApplication) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Application> getAllApprovedByAuction(int idAuction) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Application> getAllNotApproved() {
		// TODO Auto-generated method stub
		return null;
	}

}
