package com.javaweb.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaweb.reponsitory.enity.BuildingEntity;
import com.javaweb.reponsitory.BuildingReponsitory;
@RestController
@RequestMapping(value = "/buildings")

public class BuildingAPI {
	static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/estatebasic";
	static final String USER= "root";
	static final String PASS ="24681357";
	@Autowired
	private final BuildingReponsitory BuildingReponsitory;
	public BuildingAPI(BuildingReponsitory buildingRepository) {
		this.BuildingReponsitory = buildingRepository;
	}
	
	@GetMapping ()
	public Object getBuilding(@RequestParam (name = "name", required = false) String name,
	@RequestParam (name = "numberOfBasement",required = false) Long numberOfBasement){
	List<BuildingEntity> buildingEntities = BuildingReponsitory.findAll(name, numberOfBasement);
	return buildingEntities;
}
	
	

}
