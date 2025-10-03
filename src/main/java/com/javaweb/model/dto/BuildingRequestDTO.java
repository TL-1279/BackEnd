package com.javaweb.model.dto;

import java.util.List;

public class BuildingRequestDTO {
	 	private String name;
	    private Long numberOfBasement;
	    private Long floorArea;
	    private String district;
	    private String ward;
	    private String street;
	    private String direction;
	    private String level;

	    private Long areaFrom;
	    private Long areaTo;
	    private Long rentPriceFrom;
	    private Long rentPriceTo;

	    private String managerName;
	    private String managerPhone;
	    private Long id;

	private List<String> type;
	
	
	public String getName() {
		// TODO Auto-generated method stub
		return name;
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

	public List<String> getType() {
		return type;
	}
	public void setType(List<String> type) {
		this.type = type;
	}
	public Long getFloorArea() {
		return floorArea;
	}
	public void setFloorArea(Long floorArea) {
		this.floorArea = floorArea;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
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
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public Long getAreaFrom() {
		return areaFrom;
	}
	public void setAreaFrom(Long areaFrom) {
		this.areaFrom = areaFrom;
	}
	public Long getAreaTo() {
		return areaTo;
	}
	public void setAreaTo(Long areaTo) {
		this.areaTo = areaTo;
	}
	public Long getRentPriceFrom() {
		return rentPriceFrom;
	}
	public void setRentPriceFrom(Long rentPriceFrom) {
		this.rentPriceFrom = rentPriceFrom;
	}
	public Long getRentPriceTo() {
		return rentPriceTo;
	}
	public void setRentPriceTo(Long rentPriceTo) {
		this.rentPriceTo = rentPriceTo;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getManagerPhone() {
		return managerPhone;
	}
	public void setManagerPhone(String managerPhone) {
		this.managerPhone = managerPhone;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}


}
