package com.my.auctions.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.auctions.dao.UserDao;
import com.my.auctions.model.User;
import com.my.auctions.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;

	@Override
	public void add(User user) {
		userDao.add(user);
	}

	@Override
	public void update(User user) {
		userDao.update(user);
	}

	@Override
	public void delete(int idUser) {
		userDao.delete(idUser);
	}

	@Override
	public User getById(int idUser) {
		return userDao.getById(idUser);
	}

}
