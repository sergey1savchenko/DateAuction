package com.my.auctions.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.auctions.dao.AuctionDao;
import com.my.auctions.model.Auction;
import com.my.auctions.service.AuctionService;

@Service
public class AuctionServiceImpl implements AuctionService {
	
	@Autowired
	private AuctionDao auctionDao;

	@Override
	public void add(Auction auction) {
		auctionDao.add(auction);
	}

	@Override
	public void update(Auction auction) {
		auctionDao.update(auction);
	}

	@Override
	public void delete(int idAuction) {
		auctionDao.delete(idAuction);
	}

	@Override
	public Auction getById(int idAuction) {
		return auctionDao.getById(idAuction);
	}

	@Override
	public ArrayList<Auction> getAllActive() {
		return auctionDao.getAllActive();
	}

	@Override
	public ArrayList<Auction> getAllNotStarted() {
		return auctionDao.getAllNotStarted();
	}

	@Override
	public ArrayList<Auction> getAllFinished() {
		return auctionDao.getAllFinished();
	}

}
