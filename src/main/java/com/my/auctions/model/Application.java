package com.my.auctions.model;

import java.util.ArrayList;

public class Application {
	
	private int id;
	private User user;
	private Auction auction;
	private String note;
	private boolean isConsidered;
	private boolean isApproved;
	private ArrayList<Bid> bids = new ArrayList<Bid>();
	private ArrayList<Comment> comments = new ArrayList<Comment>();
	
	public Application() {
		
	}

	public Application(int id) {
		this.id = id;
	}

	public Application(int id, User user, Auction auction, String note, boolean isConsidered, boolean isApproved) {
		this.id = id;
		this.user = user;
		this.auction = auction;
		this.note = note;
		this.isConsidered = isConsidered;
		this.isApproved = isApproved;
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

	public Auction getAuction() {
		return auction;
	}

	public void setAuction(Auction auction) {
		this.auction = auction;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public boolean isConsidered() {
		return isConsidered;
	}

	public void setConsidered(boolean isConsidered) {
		this.isConsidered = isConsidered;
	}

	public boolean isApproved() {
		return isApproved;
	}

	public void setApproved(boolean isApproved) {
		this.isApproved = isApproved;
	}

	public ArrayList<Bid> getBids() {
		return bids;
	}

	public void setBids(ArrayList<Bid> bids) {
		this.bids = bids;
	}

	public ArrayList<Comment> getComments() {
		return comments;
	}

	public void setComments(ArrayList<Comment> comments) {
		this.comments = comments;
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
		Application other = (Application) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
