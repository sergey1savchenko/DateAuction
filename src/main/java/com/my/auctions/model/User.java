package com.my.auctions.model;

import java.sql.Blob;
import java.util.ArrayList;

public class User {
	
	private int id;
	private String email;
	private String password;
	private String name;
	private String city;
	private String country;
	private int sex;
	private String bio;
	private int birthYear;
	private Blob profilePhoto;
	private ArrayList<Blob> photos = new ArrayList<Blob>();
	
	public User() {
		
	}

	public User(int id) {
		this.id = id;
	}

	public User(int id, String email, String password, String name, String city, String country, int sex, String bio,
			int birthYear, Blob profilePhoto) {
		this.id = id;
		this.email = email;
		this.password = password;
		this.name = name;
		this.city = city;
		this.country = country;
		this.sex = sex;
		this.bio = bio;
		this.birthYear = birthYear;
		this.profilePhoto = profilePhoto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public Blob getProfilePhoto() {
		return profilePhoto;
	}

	public void setProfilePhoto(Blob profilePhoto) {
		this.profilePhoto = profilePhoto;
	}

	public ArrayList<Blob> getPhotos() {
		return photos;
	}

	public void setPhotos(ArrayList<Blob> photos) {
		this.photos = photos;
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
		User other = (User) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
