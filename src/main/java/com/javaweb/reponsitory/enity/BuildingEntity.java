package com.javaweb.reponsitory.enity;

public class BuildingEntity {
	private long id;
	private String name;
	private String street;
	private String ward;
	private long districtid;
	private long rentprice;
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
	
	

}
