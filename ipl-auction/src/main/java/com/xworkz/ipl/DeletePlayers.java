package com.xworkz.ipl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeletePlayers {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String jdbcUrl = "jdbc:mysql://localhost:3306/xworkz";
        String userName = "root";
        String passward = "Xworkz@123";
        String deleteQuery = "DELETE FROM cricket_info  where name = 'virat kohli'";
        String deleteQuery1 = "DELETE FROM  cricket_info  where id = 1";


        Connection connection = null;
        Statement statement = null;

        try {
            connection = DriverManager.getConnection(jdbcUrl, userName, passward);
            statement = connection.createStatement();
            boolean updateResult = statement.execute(deleteQuery);
            boolean updateResult1 = statement.execute(deleteQuery1);
            System.out.println("The updated player is " +updateResult);
            System.out.println("The updated player is "+updateResult1);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {

            if (connection != null) {
                try {
                    connection.close();
                    System.out.println("Connection is closed.....");
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                    System.out.println("Statment is closed....");
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }


            }
        }
    }
}
