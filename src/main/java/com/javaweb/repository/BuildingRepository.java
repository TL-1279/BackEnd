package com.javaweb.repository;

import java.util.List;

import com.javaweb.model.dto.BuildingRequestDTO;
import com.javaweb.repository.entity.BuildingEntity;

public interface BuildingRepository {
	 List<BuildingEntity> findAll(BuildingRequestDTO request);
	
	void delete(long id);
}
