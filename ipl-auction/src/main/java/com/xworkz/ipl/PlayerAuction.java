package com.xworkz.ipl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PlayerAuction {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        Connection connection=null;
        Statement statement = null;
try {


    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz", "root", "Xworkz@123");
    statement = connection.createStatement();
    statement.execute("insert into cricket_info values (1,'Virat kohli')");
    statement.execute("insert into cricket_info values (2,'Faf duplesis')");
    statement.execute("insert into cricket_info values (3,'Rajat Patidar')");
    statement.execute("insert into cricket_info values (4,'Glenn Maxewell')");
    statement.execute("insert into cricket_info values (5,'Green')");
    statement.execute("insert into cricket_info values (6,'Lomror')");
    statement.execute("insert into cricket_info values (7,'Dk')");
    statement.execute("insert into cricket_info values (8,'Karn')");
    statement.execute("insert into cricket_info values (9,'Siraj')");
    statement.execute("insert into cricket_info values (10,'Vyashak Vijaykumar')");
    statement.execute("insert into cricket_info values (11,'Alzarri Joseph')");

}catch (SQLException e){
    e.printStackTrace();
}
    }

}
