package com.xworkz.tourism.repository;

import com.xworkz.tourism.dto.WaterFall;

import java.sql.*;
import java.util.List;

public class WaterFallRepositoryImpl implements WaterFallRepository {
    @Override
    public void saveWaterFall(WaterFall waterFall) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbc = "jdbc:mysql://localhost:3306/tourism";
        String username = "root";
        String passward = "Xworkz@123";
        String insertQuery = "Insert into waterfall (name,place,riverName,state)" + " values (?,?,?,?)";


        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection(jdbc, username, passward);
            preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, waterFall.getName());
            preparedStatement.setString(2, waterFall.getPlace());
            preparedStatement.setString(3, waterFall.getRiverName());
            preparedStatement.setString(4, waterFall.getState());
            preparedStatement.execute();
            System.out.println("Waterfalls are added sucessfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void saveWaterFall(List<WaterFall> waterFalls) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbc = "jdbc:mysql://localhost:3306/tourism";
        String username = "root";
        String passward = "Xworkz@123";
        String insertQuery = "Insert into waterfall (name,place,riverName,state)" + " values (?,?,?,?)";


        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection(jdbc, username, passward);
            preparedStatement = connection.prepareStatement(insertQuery);
            for (WaterFall waterFall : waterFalls) {
                preparedStatement.setString(1, waterFall.getName());
                preparedStatement.setString(2, waterFall.getPlace());
                preparedStatement.setString(3, waterFall.getRiverName());
                preparedStatement.setString(4, waterFall.getState());
                preparedStatement.executeUpdate();
            }
            System.out.println("Waterfalls are added sucessfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void updateRiverByName(String waterFallName, String river) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbc = "jdbc:mysql://localhost:3306/tourism";
        String username = "root";
        String passward = "Xworkz@123";
        String updateQuery = "Update WaterFall set riverName=?,where name=?";


        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection(jdbc, username, passward);
            preparedStatement = connection.prepareStatement(updateQuery);
            preparedStatement.setString(1, river);
            preparedStatement.setString(2, waterFallName);
            preparedStatement.execute();
            System.out.println("updating river name " + river + "by water fall " + waterFallName);


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public boolean deleteWaterFallByName(String waterFallName) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String jdbc = "jdbc:mysql://localhost:3306/tourism";
        String username = "root";
        String passward = "Xworkz@123";
        String deleteQuery = "Delete  from WaterFall where name = ?";


        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection(jdbc, username, passward);
            preparedStatement = connection.prepareStatement(deleteQuery);
            preparedStatement.setString(1, waterFallName);
            preparedStatement.executeUpdate();
            System.out.println("Delete record");
            return true;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public WaterFall getWaterFallByName(String WaterFallName) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String jdbc = "jdbc:mysql://localhost:3306/tourism";
        String username = "root";
        String passward = "Xworkz@123";
        String fetchQuery ="Select * from waterfall where name=?";
        ResultSet resultSet = null;

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection(jdbc, username, passward);
            preparedStatement = connection.prepareStatement(fetchQuery);
            preparedStatement.setString(1,WaterFallName);
          resultSet= preparedStatement.executeQuery();
           WaterFall waterFall = new WaterFall();
           if (resultSet.next()){
//               resultSet.getString("riverName");
//               resultSet.getString("name");
//               resultSet.getString("place");
//               resultSet.getString("state");
//               resultSet.getString(4);
               waterFall.setName(resultSet.getString("name"));
               waterFall.setPlace(resultSet.getString("place"));
               waterFall.setState(resultSet.getString("state"));
               waterFall.setRiverName(resultSet.getString("riverName"));
//               resultSet= preparedStatement.executeQuery();
//
           }
           return waterFall;

        } catch (SQLException e) {
            System.out.println(e);
            return  null;
        }
    }
}