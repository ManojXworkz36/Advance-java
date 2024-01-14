package com.xworkz.ipl;

import java.sql.*;

public class PlayersPreparedInsert {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String jdbcUrl = "jdbc:mysql://localhost:3306/xworkz";
        String userName = "root";
        String passward = "Xworkz@123";
       // String insertQuery = "Insert into rivers (riverId,riverName,riverPlace,riverLength,riverWidth,riverState,riverTributaries,riverBirthplace) values(?,?,?,?,?,?,?,?)";

        String updateQuery = "update rivers set riverstate=? where rivername=?";
        Connection connection = null;
        PreparedStatement preparedStatement = null;


        try {
            connection = DriverManager.getConnection(jdbcUrl, userName, passward);
            preparedStatement = connection.prepareStatement(updateQuery);
            preparedStatement.setString(2, "ganga");
            preparedStatement.setString(1,"TamilNadu");
//          preparedStatement.setString(3, "jp nagar");
//            preparedStatement.setInt(4, 4555);
//            preparedStatement.setInt(5, 2343);
//            preparedStatement.setString(6, "karnataka");
//            preparedStatement.setString(7, "brahma");
//            preparedStatement.setString(8, "putra");
          preparedStatement.execute();
            System.out.println("Done with the prepared statement");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }


            }
        }
    }
}
