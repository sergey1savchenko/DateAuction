package com.my.auctions.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.auctions.dao.ApplicationDao;
import com.my.auctions.model.Application;
import com.my.auctions.service.ApplicationService;

@Service
public class ApplicationServiceImpl implements ApplicationService {
	
	@Autowired
	private ApplicationDao applicationDao;

	@Override
	public void add(Application application) {
		applicationDao.add(application);
	}

	@Override
	public void update(Application application) {
		applicationDao.update(application);
	}

	@Override
	public void delete(int idApplication) {
		applicationDao.delete(idApplication);
	}

	@Override
	public Application getById(int idApplication) {
		return applicationDao.getById(idApplication);
	}

	@Override
	public ArrayList<Application> getAllByAuction(int idAuction) {
		return applicationDao.getAllByAuction(idAuction);
	}

}
