package com.javaweb.model.dto;
// trả dữ liệu 
public class BuildingResponeDTO {
	private long id;
	private String name;
	private long numberOfBasement;
	private long rentPrice; 
	private String rentAreas;
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
	
	public String getRentAreas() {
        return rentAreas;
    }
    public void setRentAreas(String rentAreas) {
        this.rentAreas = rentAreas;
    }

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
}
