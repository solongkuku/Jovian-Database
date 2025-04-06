package com.jovi.jovi.skymap;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private Connection databaseLink;

    public Connection getConnection() {
        String databaseUser = "root";
        String databasePassword = "database";
        String url = "jdbc:mysql://127.0.0.1:3306/alien_species_catalog";

        try {
            databaseLink = DriverManager.getConnection(url, databaseUser, databasePassword);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return databaseLink;
    }

    public void closeConnection() {
        if (databaseLink != null) {
            try {
                databaseLink.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}