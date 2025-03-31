package com.jovi.jovi;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class Controller {

    public Pane pane1;
    public Pane pane2;
    public Pane pane3;
    public Label homeTitle;
    public Button engage;
    public MenuItem Zortians;
    public MenuItem Aqarians;
    public MenuItem Volarians;
    public MenuItem Terraformis;
    public MenuItem Mechanoforms;
    public MenuItem Luminari;
    public MenuItem Gravitites;
    public MenuItem Nebulites;
    public MenuItem Chronos;
    public MenuItem Symbionts;


    Stage space;

    // to begin the app
    public void engage(ActionEvent event) throws IOException {

        FXMLLoader menuload = new FXMLLoader(getClass().getResource("menu.fxml"));
        Scene menu = new Scene(menuload.load());
        space = (Stage) ( (Node)event.getSource() ).getScene().getWindow();
        space.setScene(menu);
        space.show();

    }

    // to go back to the home screen
    public void disengage(ActionEvent event) throws IOException {

        FXMLLoader homeload = new FXMLLoader(getClass().getResource("home.fxml"));
        Scene home = new Scene(homeload.load());
        space = (Stage) ( (Node)event.getSource() ).getScene().getWindow();
        space.setScene(home);
        space.show();

    }

    // to research species
    public void showSpecies(ActionEvent event) throws IOException {

        FXMLLoader speciesload = new FXMLLoader(getClass().getResource("species.fxml"));
        Scene species = new Scene(speciesload.load());
        space = (Stage) ( (Node)event.getSource() ).getScene().getWindow();
        space.setScene(species);
        space.show();
    }


}