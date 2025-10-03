package com.javaweb.repository.entity;


public class RentAreaEntity {
	private Long id;

    private int value;
    private Long buildingId;
    
    
	public long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public long getBuildingId() {
		return buildingId;
	}
	public void setBuildingId(Long buildingId) {
		this.buildingId = buildingId;
	}

    

}
