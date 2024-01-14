package com.xworkz.ipl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeletePreparedSt {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcUrl = "jdbc:mysql://localhost:3306/xworkz";
        String userName = "root";
        String passward = "Xworkz@123";

        String deleteQuery = "delete from rivers where rivertributaries=?";
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection= DriverManager.getConnection(jdbcUrl,userName,passward);
            preparedStatement=connection.prepareStatement(deleteQuery);

            preparedStatement.setString(1,"Bhadra");
            preparedStatement.execute();
            System.out.println("Deleted Sucessfully");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
