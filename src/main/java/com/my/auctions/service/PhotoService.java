package com.my.auctions.service;

import java.util.ArrayList;

import com.my.auctions.model.Photo;

public interface PhotoService {
	
	void add(Photo photo);
	void delete(int idPhoto);
	
	ArrayList<Photo> getAllByUser(int idUser);

}
