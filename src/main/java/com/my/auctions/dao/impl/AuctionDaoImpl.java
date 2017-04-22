package com.my.auctions.dao.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
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
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Auction auction) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int idAuction) {
		// TODO Auto-generated method stub

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
