package com.javaweb.repository.entity;

import java.util.ArrayList;
import java.util.List;

public class BuildingEntity {
	private long id;
	private String name;
	private long numberOfBasement;
	private String street;
	private String ward;
	private long districtid;
	private long rentprice;
	private List<RentAreaEntity> rentAreas = new ArrayList<>();
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getWard() {
		return ward;
	}
	public void setWard(String ward) {
		this.ward = ward;
	}
	public long getDistrictid() {
		return districtid;
	}
	public void setDistrictid(long districtid) {
		this.districtid = districtid;
	}
	public long getRentprice() {
		return rentprice;
	}
	public void setRentprice(long rentprice) {
		this.rentprice = rentprice;
	}
	public long getNumberOfBasement() {
		return numberOfBasement;
	}
	public void setNumberOfBasement(long numberOfBasement) {
		this.numberOfBasement = numberOfBasement;
	}
	public List<RentAreaEntity> getRentAreas() {
		return rentAreas;
	}
	public void setRentAreas(List<RentAreaEntity> rentAreas) {
		this.rentAreas = rentAreas;
	}

	
	

}
