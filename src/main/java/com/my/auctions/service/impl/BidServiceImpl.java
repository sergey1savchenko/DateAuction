package com.my.auctions.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.auctions.dao.BidDao;
import com.my.auctions.model.Bid;
import com.my.auctions.service.BidService;

@Service
public class BidServiceImpl implements BidService {
	
	@Autowired
	private BidDao bidDao;

	@Override
	public void add(Bid bid) {
		bidDao.add(bid);
	}

	@Override
	public void delete(int idBid) {
		bidDao.delete(idBid);
	}

	@Override
	public double getMaxByLot(int idLot) {
		return bidDao.getMaxByLot(idLot);
	}

}
