package com.my.auctions.service;

import java.util.List;

import com.my.auctions.model.Application;

public interface ApplicationService {
	
	void add(Application application);
	void update(Application application);
	void delete(int idApplication);
	
	Application getById(int idApplication);
	List<Application> getAllApprovedByAuction(int idAuction);
	List<Application> getAllNotApproved();
}
