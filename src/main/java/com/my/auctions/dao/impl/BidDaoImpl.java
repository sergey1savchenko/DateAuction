package com.my.auctions.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
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
		KeyHolder keyHolder = new GeneratedKeyHolder();
		jdbcTemplate.update(new PreparedStatementCreator() {

			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement ps = con.prepareStatement(SQL_ADD_BID, new String[] { "id" });
				ps.setInt(1, bid.getUser().getId());
				ps.setInt(2, bid.getApplication().getId());
				ps.setDouble(3, bid.getBidValue());
				return ps;
			}
			
		}, keyHolder);	
		bid.setId(keyHolder.getKey().intValue());
	}

	@Override
	public void delete(int idBid) {
		jdbcTemplate.update(SQL_DELETE_BID, idBid);
	}

	@Override
	public double getMaxByLot(int idLot) {
		// TODO Auto-generated method stub
		return 0;
	}

}
