package com.my.auctions.model;

import java.sql.Date;

public class Comment {
	
	private int id;
	private User user;
	private Application lot;
	private String note;
	private Date publishedDate;
	
	public Comment() {
		
	}

	public Comment(int id) {
		this.id = id;
	}

	public Comment(int id, User user, Application lot, String note, Date publishedDate) {
		this.id = id;
		this.user = user;
		this.lot = lot;
		this.note = note;
		this.publishedDate = publishedDate;
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

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Date getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
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
		Comment other = (Comment) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
