package com.jovi.jovi;

import java.sql.*;

public class DatabaseConnection {
    public Connection databaseLink;

    public Connection getConnection(){
        String databaseUser = "root";
        String databasePassword = "database";
        String url = "jdbc:mysql://127.0.0.1:3306/alien_species_catalog";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseLink = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/alien_species_catalog", databaseUser, databasePassword);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return databaseLink;
    }
}
