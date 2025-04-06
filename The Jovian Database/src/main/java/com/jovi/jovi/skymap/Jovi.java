package com.jovi.jovi.skymap;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.lang.Exception;

public class Jovi extends Application {
    @Override
    public void start(Stage Home) throws Exception {

        try {
            FXMLLoader homeload = new FXMLLoader(Jovi.class.getResource("home.fxml"));
            Scene home = new Scene(homeload.load());
            Home.setTitle("Jovi");
            Home.setScene(home);
            Home.show();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error loading FXML file: " + e.getMessage());
        }
    }

    public static void main(String[] args) { launch(); }
}