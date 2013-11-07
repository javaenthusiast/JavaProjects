package com.pluralsight.model;

import java.util.Date;

public class Servings {

	private String items;
	private Date date;
	private double servings;
	private int userId;
	private String userName;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getServings() {
		return servings;
	}

	public void setServings(double servings) {
		this.servings = servings;
	}
}
