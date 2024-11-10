package com.dealership;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class InventoryDAO {
    // Add a new car to the inventory
    public void addCar(Car car) {
        String query = "INSERT INTO cars (model, year, price, image_url) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, car.getModel());
            stmt.setInt(2, car.getYear());
            stmt.setDouble(3, car.getPrice());
            stmt.setString(4, car.getImageUrl());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Get all cars in the inventory
    public List<Car> getAllCars() {
        List<Car> cars = new ArrayList<>();
        String query = "SELECT * FROM cars";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                Car car = new Car(
                    rs.getInt("id"),
                    rs.getString("model"),
                    rs.getInt("year"),
                    rs.getDouble("price"),
                    rs.getString("image_url")
                );
                cars.add(car);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cars;
    }
}
