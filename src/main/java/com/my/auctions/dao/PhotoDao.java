package com.my.auctions.dao;

import java.util.ArrayList;

import com.my.auctions.model.Photo;

public interface PhotoDao {
	
	void add(Photo photo);
	void delete(int idPhoto);
	
	ArrayList<Photo> getAllByUser(int idUser);

}
