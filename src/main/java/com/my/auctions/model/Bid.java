package com.my.auctions.model;

public class Bid {
	
	private int id;
	private User user;
	private Application lot;
	private double bidValue;
	
	public Bid() {

	}

	public Bid(int id) {
		this.id = id;
	}

	public Bid(int id, User user, Application lot, double bidValue) {
		this.id = id;
		this.user = user;
		this.lot = lot;
		this.bidValue = bidValue;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Application getApplication() {
		return lot;
	}

	public void setApplication(Application lot) {
		this.lot = lot;
	}

	public double getBidValue() {
		return bidValue;
	}

	public void setBidValue(double bidValue) {
		this.bidValue = bidValue;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bid other = (Bid) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
