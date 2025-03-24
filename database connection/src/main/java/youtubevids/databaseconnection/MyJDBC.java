package youtubevids.databaseconnection;

import java.sql.*;

public class MyJDBC {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/alien_species_catalog",
                    "root",
                    "database"
            );
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from alien_species_catalog.alien_species");
            while (rs.next()) {
                System.out.println(rs.getString(2));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
