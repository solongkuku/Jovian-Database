package com.jovi.jovi;

import java.sql.*;

public class Test {
    public static void main(String[] args) {
        DatabaseConnection ZorD = new DatabaseConnection();
        Connection ZorConn = ZorD.getConnection();

        String query = "SELECT * FROM aliens_species WHERE species = 'Zortians'";

        try {
            Statement s = ZorConn.createStatement();
            ResultSet rs = s.executeQuery(query);

            while (rs.next()) {
                System.out.println(rs.getString(1));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
