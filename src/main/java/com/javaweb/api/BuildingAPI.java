package com.javaweb.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaweb.service.BuildingService;
import com.javaweb.model.dto.BuildingRequestDTO;

@RestController
@RequestMapping(value = "/buildings")

public class BuildingAPI {
	@Autowired
	private final BuildingService buildingService;

	public BuildingAPI(BuildingService buildingService) {
		this.buildingService = buildingService;
	}

	@GetMapping()
	public Object getBuilding(@RequestParam(name = "id", required = false) Long id,
			 	@RequestParam(name = "name", required = false) String name,
			 	@RequestParam(name = "numberOfBasement", required = false) Long numberOfBasement,
			 	@RequestParam(name = "district", required = false) String district,
		     	@RequestParam(name = "ward", required = false) String ward,
		        @RequestParam(name = "street", required = false) String street,
		        @RequestParam(name = "direction", required = false) String direction,
		        @RequestParam(name = "level", required = false) String level,
		        @RequestParam(name = "areaFrom", required = false) Long areaFrom,
		        @RequestParam(name = "areaTo", required = false) Long areaTo,
		        @RequestParam(name = "rentPriceFrom", required = false) Long rentPriceFrom,
		        @RequestParam(name = "rentPriceTo", required = false) Long rentPriceTo,
		        @RequestParam(name = "managerName", required = false) String managerName,
		        @RequestParam(name = "managerPhone", required = false) String managerPhone){
		
		    BuildingRequestDTO request = new BuildingRequestDTO();
		    request.setId(id);
		    request.setName(name);
		    request.setNumberOfBasement(numberOfBasement);
		    request.setDistrict(district);
		    request.setWard(ward);
		    request.setStreet(street);
		    request.setDirection(direction);
		    request.setLevel(level);
		    request.setAreaFrom(areaFrom);
		    request.setAreaTo(areaTo);
		    request.setRentPriceFrom(rentPriceFrom);
		    request.setRentPriceTo(rentPriceTo);
		    request.setManagerName(managerName);
		    request.setManagerPhone(managerPhone);

		    return BuildingService.findAll(request);
	
	}
}
