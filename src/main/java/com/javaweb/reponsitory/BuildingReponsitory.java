package com.javaweb.reponsitory;

import java.util.List;
import com.javaweb.reponsitory.enity.BuildingEntity;

public interface BuildingReponsitory {
	 static List<BuildingEntity> findAll(String name, Long numberOfBasement) {
		return null;
	}
	
	void delete(long id);
}
