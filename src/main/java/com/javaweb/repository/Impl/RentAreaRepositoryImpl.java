package com.javaweb.repository.Impl;

import org.springframework.stereotype.Repository;

import com.javaweb.repository.RentAreaRepository;
import com.javaweb.repository.entity.RentAreaEntity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class RentAreaRepositoryImpl implements RentAreaRepository {
    private static final String URL = "jdbc:mysql://localhost:3306/estatebasic";
    private static final String USER = "root";
    private static final String PASSWORD = "123456";

    @Override
    public List<RentAreaEntity> findByBuildingId(long buildingId) {
        List<RentAreaEntity> results = new ArrayList<>();
        String sql = "SELECT * FROM rentarea WHERE buildingid = ?";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setLong(1, buildingId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                RentAreaEntity entity = new RentAreaEntity();
                entity.setId(rs.getLong("id"));
                entity.setValue(rs.getInt("value"));
                entity.setBuildingId(rs.getLong("buildingid"));
                results.add(entity);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return results;
    }

	
}
