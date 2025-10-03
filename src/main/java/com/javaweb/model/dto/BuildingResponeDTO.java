package com.javaweb.model.dto;
// trả dữ liệu 
public class BuildingResponeDTO {
	private Long id;
	private String name;
	private Long numberOfBasement;
	private Long rentPrice; 
	private String rentAreas;
	private String address;
	
	public String getName() {
		return name;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Long getNumberOfBasement() {
		return numberOfBasement;
	}
	public void setNumberOfBasement(Long numberOfBasement) {
		this.numberOfBasement = numberOfBasement;
	}
	public long getRentPrice() {
		return rentPrice;
	}
	public void setRentPrice(Long rentPrice) {
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
