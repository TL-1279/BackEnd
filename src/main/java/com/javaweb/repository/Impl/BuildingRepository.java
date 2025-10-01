package com.javaweb.repository.Impl;

import java.util.List;

import com.javaweb.repository.entity.BuildingEntity;

public interface BuildingRepository {
	 static List<BuildingEntity> findAll(String name, Long numberOfBasement) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	void delete(long id);
}
