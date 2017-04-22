package com.my.auctions.dao;

import com.my.auctions.model.Bid;

public interface BidDao {
	
	void add(Bid bid);
	void delete(int idBid);
	
	double getMaxByLot(int idLot);

}
