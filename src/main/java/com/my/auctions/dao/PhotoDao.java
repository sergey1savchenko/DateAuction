package com.my.auctions.dao;

import java.util.List;

import com.my.auctions.model.Photo;

public interface PhotoDao {
	
	void add(Photo photo);
	void delete(int idPhoto);
	
	List<Photo> getAllByUser(int idUser);

}
