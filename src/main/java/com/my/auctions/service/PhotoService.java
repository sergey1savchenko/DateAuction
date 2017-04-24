package com.my.auctions.service;

import java.util.List;

import com.my.auctions.model.Photo;

public interface PhotoService {
	
	void add(Photo photo);
	void delete(int idPhoto);
	
	List<Photo> getAllByUser(int idUser);

}
