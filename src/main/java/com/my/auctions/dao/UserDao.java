package com.my.auctions.dao;

import com.my.auctions.model.User;
import com.my.auctions.model.UserAuth;

public interface UserDao {

	void add(User user);
	void update(User user);
	void delete(int idUser);
	
	User getById(int idUser);
	
	UserAuth getUserAuth(String email);

}