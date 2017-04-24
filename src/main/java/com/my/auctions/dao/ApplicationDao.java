package com.my.auctions.dao;

import java.util.ArrayList;

import com.my.auctions.model.Application;

public interface ApplicationDao {
	
	void add(Application application);
	void update(Application application);
	void delete(int idApplication);
	
	Application getById(int idApplication);
	ArrayList<Application> getAllApprovedByAuction(int idAuction);
	ArrayList<Application> getAllNotApproved();

}
