package com.my.auctions.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.my.auctions.dao.BidDao;
import com.my.auctions.model.Bid;

@Repository
public class BidDaoImpl implements BidDao {
	
	private static final String SQL_ADD_BID = "INSERT INTO Bids (userId, lotId, bidValue) values (?, ?, ?);";
	private static final String SQL_DELETE_BID = "DELETE FROM Bids WHERE id=?;";
	private static final String SQL_GET_MAX_BID_BY_LOT = "SELECT MAX(bidValue) FROM Bids WHERE lotId=?;";
	
    @Autowired
    private JdbcTemplate jdbcTemplate;

	@Override
	public void add(Bid bid) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int idBid) {
		// TODO Auto-generated method stub

	}

	@Override
	public double getMaxByLot(int idLot) {
		// TODO Auto-generated method stub
		return 0;
	}

}
