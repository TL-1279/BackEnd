package com.javaweb.service;

import java.util.List;

import com.javaweb.model.dto.BuildingResponeDTO;

public interface BuildingService {

	List<BuildingResponeDTO> findAll(String name, Long numberOfBasement);

}
