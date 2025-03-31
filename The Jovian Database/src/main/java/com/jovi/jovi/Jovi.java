package com.jovi.jovi;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Jovi extends Application {
    @Override
    public void start(Stage Home) throws IOException {

        // load home fxml file
        FXMLLoader homeload = new FXMLLoader(getClass().getResource("home.fxml"));

        // create a scene
        Scene home = new Scene(homeload.load());

        // initialize the app
        Home.setTitle("Jovi");
        Home.setScene(home);
        Home.show();

    }

    public static void main(String[] args) {
        launch();
    }
}