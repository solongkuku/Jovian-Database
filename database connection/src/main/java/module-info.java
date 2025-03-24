module youtubevids.databaseconnection {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    opens youtubevids.databaseconnection to javafx.fxml;
    exports youtubevids.databaseconnection;
}