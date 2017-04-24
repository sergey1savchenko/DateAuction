package com.my.auctions.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.auctions.dao.PhotoDao;
import com.my.auctions.model.Photo;
import com.my.auctions.service.PhotoService;

@Service
public class PhotoServiceImpl implements PhotoService {

	@Autowired
	private PhotoDao photoDao;
	
	@Override
	public void add(Photo photo) {
		photoDao.add(photo);
	}

	@Override
	public void delete(int idPhoto) {
		photoDao.delete(idPhoto);
	}

	@Override
	public List<Photo> getAllByUser(int idUser) {
		return photoDao.getAllByUser(idUser);
	}

}
