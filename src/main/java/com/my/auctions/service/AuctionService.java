package com.my.auctions.service;

import java.util.List;

import com.my.auctions.model.Auction;

public interface AuctionService {
	
	void add(Auction auction);
	void update(Auction auction);
	void delete(int idAuction);
	
	Auction getById(int idAuction);
	
	List<Auction> getAllActive();
	List<Auction> getAllNotStarted();
	List<Auction> getAllFinished();

}
