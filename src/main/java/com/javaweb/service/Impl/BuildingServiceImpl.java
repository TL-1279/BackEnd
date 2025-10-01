package com.javaweb.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaweb.model.dto.BuildingResponeDTO;
import com.javaweb.repository.Impl.BuildingRepository;
import com.javaweb.repository.entity.BuildingEntity;
import com.javaweb.service.BuildingService;

@Service
public class BuildingServiceImpl implements BuildingService {

    @Autowired
    private BuildingRepository buildingReponsitory;

    @Override
    public List<BuildingResponeDTO> findAll(String name, Long numberOfBasement) {
        List<BuildingEntity> buildingEntities = BuildingRepository.findAll(name, numberOfBasement);
        List<BuildingResponeDTO> buildingResponseDTOs = new ArrayList<>();

        for (BuildingEntity it : buildingEntities) {
            BuildingResponeDTO dto = new BuildingResponeDTO();
            dto.setId(it.getId());
            dto.setName(it.getName());
            dto.setNumberOfBasement(it.getNumberOfBasement()); 
            dto.setAddress(it.getStreet() + " " + it.getWard() + ", " + it.getDistrictid());
            
            buildingResponseDTOs.add(dto);
        }

        return buildingResponseDTOs;
    }
}
