package com.javaweb.reponsitory.Impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.javaweb.reponsitory.BuildingReponsitory;
import com.javaweb.repository.entity.BuildingEntity;

public class BuildingRepositoryImpl implements BuildingReponsitory {
	static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/estatebasic";
	static final String USER = "root";
	static final String PASS = "24681357";

	public List<BuildingEntity> findAll(String name, Long numberOfBasement) {
		List<BuildingEntity> buildingEntities = new ArrayList<>();

		String sql = "SELECT b.* FROM Building b WHERE 1 = 1";
		if (name != null && !name.isEmpty()) {
			sql += " AND b.name LIKE '%" + name + "%' ";
		}
		if (numberOfBasement != null) {
			sql += " AND b. numberofBasement = " + numberOfBasement;
		}

		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery(sql)) {
			while (rs.next()) {
				BuildingEntity building = new BuildingEntity();
				building.setName(rs.getString("name"));
				building.setId(rs.getLong("id"));
				building.setStreet(rs.getString("street"));
				building.setRentprice(rs.getLong("rentPrice"));
				building.setWard(rs.getString("ward"));
				building.setDistrictid(rs.getLong("districtid"));
				buildingEntities.add(building);
			}
		}

		catch (SQLException ex) {
			ex.printStackTrace();
		}
		return buildingEntities;

	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		       String sql = "DELETE FROM Building WHERE id = ?";
		        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		            PreparedStatement ps = conn.prepareStatement(sql)) {
		            ps.setLong(1, id);
		            ps.executeUpdate();
		        } catch (SQLException ex) {
		            ex.printStackTrace();
		        }
		   
	}
}