package com.javaweb.model.dto;
// trả dữ liệu 
public class BuildingResponeDTO {
	private long id;
	private String name;
	private long numberOfBasement;
	private long rentPrice; 
	private String ward; 
	private String street;
	private String address;
	
	public String getName() {
		return name;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Long getNumberOfBasement() {
		return numberOfBasement;
	}
	public void setNumberOfBasement(long numberOfBasement) {
		this.numberOfBasement = numberOfBasement;
	}
	public long getRentPrice() {
		return rentPrice;
	}
	public void setRentPrice(long rentPrice) {
		this.rentPrice = rentPrice;
	}
	public String getWard() {
		return ward;
	}
	public void setWard(String ward) {
		this.ward = ward;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
}
