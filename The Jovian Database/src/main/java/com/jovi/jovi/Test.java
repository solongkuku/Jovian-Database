package com.jovi.jovi;

import java.sql.*;

public class Test {
    public static void main(String[] args) {
        DatabaseConnection ZorD = new DatabaseConnection();
        Connection ZorConn = ZorD.getConnection();

        String query = "SELECT * FROM alien_species WHERE species_name = 'Zortians'";

        try {
            Statement s = ZorConn.createStatement();
            ResultSet rs = s.executeQuery(query);

            while (rs.next()) {
                System.out.println(rs.getString(3));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ZorConn != null) {
                try {
                    ZorConn.close();
                    ZorD.closeConnection();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
