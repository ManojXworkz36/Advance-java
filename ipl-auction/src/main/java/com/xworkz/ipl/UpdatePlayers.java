package com.xworkz.ipl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdatePlayers {

    public static void main(String[] args) {
        try {
         Class.forName("com.mysql.jdbc.Driver");
           } catch (ClassNotFoundException e) {
           throw new RuntimeException(e);
          }
        String jdbcUrl = "jdbc:mysql://localhost:3306/xworkz";
        String userName = "root";
        String passward = "Xworkz@123";
        String updateQuery = "UPDATE cricket_info set id = 11 where name = 'virat kohli'";
        String updateQuery1 = "UPDATE cricket_info set name ='Lockie Ferguson' where id = 11";


        Connection connection = null;
        Statement statement = null;

        try {
            connection = DriverManager.getConnection(jdbcUrl, userName, passward);
            statement = connection.createStatement();
            boolean updateResult = statement.execute(updateQuery);
            boolean updateResult1 = statement.execute(updateQuery1);
             System.out.println("The updated player is " +updateResult);
            System.out.println("The updated player is "+updateResult1);

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
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }


            }
        }
    }
}