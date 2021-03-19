package com.myWebApp.accountdataservice.models;

import java.util.Date;
import java.util.UUID;

public class Item {
	
	private UUID id;
	private String Name;
	private Double Price;
	private Date CreatedDate;
	
	
	public Item() {
		
	}
	
	public Item(UUID id, String name, Double price, Date createdDate) {
		super();
		this.id = id;
		Name = name;
		Price = price;
		CreatedDate = createdDate;
	}
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Double getPrice() {
		return Price;
	}
	public void setPrice(Double price) {
		Price = price;
	}
	public Date getCreatedDate() {
		return CreatedDate;
	}
	public void setCreatedDate(Date createdDate) {
		CreatedDate = createdDate;
	}
	
	

}
