package com.my.auctions.service;

import com.my.auctions.model.User;

public interface UserService {
	
	void add(User user);
	void update(User user);
	void delete(int idUser);
	
	User getById(int idUser);

}
