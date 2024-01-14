package com.xworkz.ipl;

import java.sql.*;

public class FetchUpdatedPlayers {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcUrl = "jdbc:mysql://localhost:3306/xworkz";
        String userName = "root";
        String passward = "Xworkz@123";
String fetchQuery = "Select * from rivers ";
        Connection connection = null;
        PreparedStatement preparedStatement = null;


        try {
            connection = DriverManager.getConnection(jdbcUrl, userName, passward);
            preparedStatement = connection.prepareStatement(fetchQuery);
           // preparedStatement.setString(1,"Ganga");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.println("name of river== "+ resultSet.getString(2));
                System.out.println("river id === "+ resultSet.getInt("riverid"));
                System.out.println("river place === " + resultSet.getString(3));
                System.out.println("river length=== "+resultSet.getInt(4));
                System.out.println("river width==== "+resultSet.getInt(5));
                System.out.println("river state==== "+resultSet.getString(6));
                System.out.println("river tributaries === " +resultSet.getString(7) );
                System.out.println("river birthPlace === "+resultSet.getString(8));


            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
