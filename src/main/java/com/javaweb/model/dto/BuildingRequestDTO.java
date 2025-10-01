package com.javaweb.model.dto;

import java.util.List;

public class BuildingRequestDTO {
	private String name;
	private long numberOfBasement;
	private List<String> type;
	
	
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public long getNumberOfBasement() {
		return numberOfBasement;
	}


	public void setNumberOfBasement(long numberofBasement) {
		this.numberOfBasement = numberOfBasement;
	}

	public List<String> getType() {
		return type;
	}
	public void setType(List<String> type) {
		this.type = type;
	}


}
