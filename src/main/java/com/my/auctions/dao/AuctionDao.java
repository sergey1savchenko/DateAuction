package com.my.auctions.dao;

import java.util.ArrayList;

import com.my.auctions.model.Auction;

public interface AuctionDao {
	
	void add(Auction auction);
	void update(Auction auction);
	void delete(int idAuction);
	
	Auction getById(int idAuction);
	
	ArrayList<Auction> getAllActive();
	ArrayList<Auction> getAllNotStarted();
	ArrayList<Auction> getAllFinished();
	
}
