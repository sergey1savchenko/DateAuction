package com.my.auctions.service;

import com.my.auctions.model.Bid;

public interface BidService {
	
	void add(Bid bid);
	void delete(int idBid);
	
	double getMaxByLot(int idLot);

}
