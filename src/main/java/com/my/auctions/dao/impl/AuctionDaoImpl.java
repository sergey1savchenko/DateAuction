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

import com.my.auctions.dao.AuctionDao;
import com.my.auctions.model.Auction;

@Repository
public class AuctionDaoImpl implements AuctionDao {
	
	private static final String SQL_ADD_AUCTION = "INSERT INTO Auctions "
			+ "(minBid, maxBid, step, startDate, endDate, title, address, purpose, description, photo) "
			+ "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
	private static final String SQL_UPDATE_AUCTION = "UPDATE Auctions SET minBid=?, maxBid=?, step=?, startDate=?, "
			+ "endDate=?, title=?, address=?, purpose=?, description=?, photo=? WHERE id=?;";
	private static final String SQL_DELETE_AUCTION = "DELETE FROM Auctions WHERE id=?;";
	private static final String SQL_GET_AUCTION_BY_ID = "SELECT * FROM Auctions WHERE id=?;";
	private static final String SQL_GET_ACTIVE_AUCTIONS = "SELECT * FROM Auctions WHERE NOW() BETWEEN startDate AND endDate;";
	private static final String SQL_GET_NOT_STARTED_AUCTIONS = "SELECT * FROM Auctions WHERE NOW() < startDate";
	private static final String SQL_GET_FINISHED_AUCTIONS = "SELECT * FROM Auctions WHERE NOW() > endDate";
	
	@Autowired
    private JdbcTemplate jdbcTemplate;

	@Override
	public void add(Auction auction) {
		KeyHolder keyHolder = new GeneratedKeyHolder();
		jdbcTemplate.update(new PreparedStatementCreator() {

			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement ps = con.prepareStatement(SQL_ADD_AUCTION, new String[] { "id" });
				ps.setInt(1, auction.getMinBid());
				ps.setInt(2, auction.getMaxBid());
				ps.setInt(3, auction.getStep());
				ps.setDate(4, auction.getStartDate());
				ps.setDate(5, auction.getEndDate());
				ps.setString(6, auction.getTitle());
				ps.setString(7, auction.getAddress());
				ps.setString(8, auction.getPurpose());
				ps.setString(9, auction.getDescription());
				ps.setBlob(10, auction.getPhoto());
				return ps;
			}
			
		}, keyHolder);	
		auction.setId(keyHolder.getKey().intValue());
	}

	@Override
	public void update(Auction auction) {
		jdbcTemplate.update(SQL_UPDATE_AUCTION, auction.getMinBid(), auction.getMaxBid(), auction.getStep(), 
				auction.getStartDate(), auction.getEndDate(), auction.getTitle(), auction.getAddress(), auction.getPurpose(), 
				auction.getDescription(), auction.getDescription(), auction.getPhoto(), auction.getId());
	}

	@Override
	public void delete(int idAuction) {
		jdbcTemplate.update(SQL_DELETE_AUCTION, idAuction);
	}

	@Override
	public Auction getById(int idAuction) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Auction> getAllActive() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Auction> getAllNotStarted() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Auction> getAllFinished() {
		// TODO Auto-generated method stub
		return null;
	}

}
