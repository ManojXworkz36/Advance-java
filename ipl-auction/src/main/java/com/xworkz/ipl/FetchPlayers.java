package com.xworkz.ipl;

import java.sql.*;

public class FetchPlayers {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcUrl = "jdbc:mysql://localhost:3306/xworkz";
        String userName = "root";
        String passward = "Xworkz@123";

        Connection connection = null;
        Statement statement = null;
        String fetchQuery = "Select * from rivers where rivername = 'krishna' ";


        try {
            connection = DriverManager.getConnection(jdbcUrl, userName, passward);
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(fetchQuery);
            System.out.println(resultSet.toString());
            if(resultSet.next()){
                System.out.println("Records Exist.....");
                String name = resultSet.getString("rivername");
                System.out.println(name);
                int id = resultSet.getInt("riverid");
                System.out.println(id);
                String state = resultSet.getString("riverstate");
                System.out.println(state);
                String birthplace = resultSet.getString(3);
                System.out.println(birthplace);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
