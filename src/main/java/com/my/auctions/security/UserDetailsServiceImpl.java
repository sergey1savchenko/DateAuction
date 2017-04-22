package com.my.auctions.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.my.auctions.dao.UserDao;
import com.my.auctions.model.UserAuth;

@Component
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		UserAuth userAuth = userDao.getUserAuth(email);
		if(userAuth == null)
			 throw new UsernameNotFoundException("No user with email " + email);
		return userAuth;
	}

}
