package com.javaweb.repository.Impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.javaweb.repository.BuildingRepository;
import com.javaweb.repository.entity.BuildingEntity;
import com.javaweb.repository.entity.RentAreaEntity;
import com.javaweb.repository.RentAreaRepository;
public class BuildingRepositoryImpl implements BuildingRepository {

    private static final String URL = "jdbc:mysql://localhost:3306/estatebasic";
    private static final String USER = "root";
    private static final String PASSWORD = "123456";

    @Override
    public List<BuildingEntity> findAll(String name, Long numberOfBasement) {
        List<BuildingEntity> buildingEntities = new ArrayList<>();
        StringBuilder sql = new StringBuilder("SELECT * FROM building WHERE 1=1 ");
        if (name != null && !name.isEmpty()) {
            sql.append("AND name LIKE '%").append(name).append("%' ");
        }
        if (numberOfBasement != null) {
            sql.append("AND numberofbasement = ").append(numberOfBasement).append(" ");
        }

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql.toString())) {

            while (rs.next()) {
                BuildingEntity building = new BuildingEntity();
                building.setId(rs.getLong("id"));
                building.setName(rs.getString("name"));
                building.setStreet(rs.getString("street"));
                building.setWard(rs.getString("ward"));
                building.setDistrictid(rs.getLong("districtid"));
                building.setRentprice(rs.getLong("rentprice"));
                building.setNumberOfBasement(rs.getLong("numberofbasement"));

                RentAreaRepository rentAreaRepo = new RentAreaRepositoryImpl();
                List<RentAreaEntity> rentAreas = rentAreaRepo.findByBuildingId(building.getId());
                building.setRentAreas(rentAreas);

                buildingEntities.add(building);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return buildingEntities;
    }

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

 }