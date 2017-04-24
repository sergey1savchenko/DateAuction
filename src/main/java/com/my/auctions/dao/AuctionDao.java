package com.my.auctions.dao;

import java.util.List;

import com.my.auctions.model.Auction;

public interface AuctionDao {
	
	void add(Auction auction);
	void update(Auction auction);
	void delete(int idAuction);
	
	Auction getById(int idAuction);
	
	List<Auction> getAllActive();
	List<Auction> getAllNotStarted();
	List<Auction> getAllFinished();
	
}
