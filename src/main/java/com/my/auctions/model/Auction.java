package com.my.auctions.model;

import java.sql.Blob;
import java.sql.Date;
import java.util.ArrayList;

public class Auction {
	
	private int id;
	private int minBid;
	private int maxBid;
	private int step;
	private Date startDate;
	private Date endDate;
	private String title;
	private String address;
	private String purpose;
	private String description;
	private Blob photo;
	private ArrayList<Application> lots = new ArrayList<Application>();
	
	public Auction() {

	}

	public Auction(int id) {
		this.id = id;
	}

	public Auction(int id, int minBid, int maxBid, int step, Date startDate, Date endDate, String title, String address,
			String purpose, String description, Blob photo) {
		super();
		this.id = id;
		this.minBid = minBid;
		this.maxBid = maxBid;
		this.step = step;
		this.startDate = startDate;
		this.endDate = endDate;
		this.title = title;
		this.address = address;
		this.purpose = purpose;
		this.description = description;
		this.photo = photo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMinBid() {
		return minBid;
	}

	public void setMinBid(int minBid) {
		this.minBid = minBid;
	}

	public int getMaxBid() {
		return maxBid;
	}

	public void setMaxBid(int maxBid) {
		this.maxBid = maxBid;
	}

	public int getStep() {
		return step;
	}

	public void setStep(int step) {
		this.step = step;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Blob getPhoto() {
		return photo;
	}

	public void setPhoto(Blob photo) {
		this.photo = photo;
	}

	public ArrayList<Application> getLots() {
		return lots;
	}

	public void setLots(ArrayList<Application> lots) {
		this.lots = lots;
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
		Auction other = (Auction) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
