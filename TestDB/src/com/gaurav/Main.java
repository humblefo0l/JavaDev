package com.gaurav;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

        try{
            Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/gauravka/JavaDev/TestDB/testjava.db");
            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS contacts " +
                                "(name TEXT, phone INTEGER, email TEXT)");
            statement.execute("INSERT INTO contacts (name, phone, email) " +
                    "VALUES('GK', 6789543, 'gk@email.com')");
            statement.close();
            conn.close();
        } catch (SQLException e){
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}
