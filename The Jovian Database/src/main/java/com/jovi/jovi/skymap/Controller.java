package com.jovi.jovi.skymap;

import javafx.embed.swing.SwingFXUtils;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import javax.imageio.ImageIO;
import java.io.*;
import java.sql.*;

public class Controller {

    public Pane pane1;
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
    public Pane pane;
    public Label bodyStructure;
    public Label lifespan;
    public Label foodSources;
    public Label planetGeography;
    public Label groupOrganisation;
    public Label reproduction;
    public Label DoS;
    public ImageView photo;
    public ImageView gr;
    public TextField name;
    public TextArea body;
    public TextArea life;
    public TextArea geo;
    public TextArea dos;
    public TextArea repro;
    public TextArea group;
    public TextArea food;
    public AnchorPane back;
    public Button exspec;


    Stage space;

    // to begin the app
    public void engage(javafx.event.ActionEvent event) throws IOException {

        FXMLLoader menuload = new FXMLLoader(getClass().getResource("menu.fxml"));
        Scene menu = new Scene(menuload.load());
        space = (Stage) ( (Node)event.getSource() ).getScene().getWindow();
        space.setScene(menu);
        space.show();

    }

    // to go back to the home screen
    public void disengage(javafx.event.ActionEvent event) throws IOException {

        FXMLLoader homeload = new FXMLLoader(getClass().getResource("home.fxml"));
        Scene home = new Scene(homeload.load());
        space = (Stage) ( (Node)event.getSource() ).getScene().getWindow();
        space.setScene(home);
        space.show();

    }

    // to research species
    public void showSpecies(javafx.event.ActionEvent event) throws IOException {

        FXMLLoader speciesload = new FXMLLoader(getClass().getResource("species.fxml"));
        Scene species = new Scene(speciesload.load());
        space = (Stage) ( (Node)event.getSource() ).getScene().getWindow();
        space.setScene(species);
        space.show();
    }

    // to show sky map
    public void showMap(javafx.event.ActionEvent event) throws IOException {

        FXMLLoader mapload = new FXMLLoader(getClass().getResource("skyMap.fxml"));
        Scene map = new Scene(mapload.load());
        space = (Stage) ( (Node)event.getSource() ).getScene().getWindow();
        space.setScene(map);
        space.show();
    }

    @FXML
    public Image getPhoto() throws IOException {
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.jpeg"));
        File file = fileChooser.showOpenDialog(null);
        try {
            return new Image(new FileInputStream(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    // to research any random species
    public void getSpecies(MouseEvent event) throws IOException {

        DatabaseConnection DBCN = new DatabaseConnection();
        Connection conn = DBCN.getConnection();

        String name = ((MenuItem)event.getSource()).getId();
        String query = "SELECT * FROM alien_species WHERE species_name = " + "'" + name + "'";

        try {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(query);

            if (rs.next()) {
                bodyStructure.setText(rs.getString("body_structure"));
                lifespan.setText(rs.getString("lifespan"));
                planetGeography.setText(rs.getString("planet_geography"));
                foodSources.setText(rs.getString("food_sources"));
                groupOrganisation.setText(rs.getString("group_organisation"));
                reproduction.setText(rs.getString("reproduction"));
                DoS.setText(rs.getString("development_of_societies"));

                InputStream imageStream = rs.getBinaryStream("image");
                if (imageStream != null) {
                    Image image = new Image(imageStream);
                    photo.setImage(image);
                }

                InputStream graphStream = rs.getBinaryStream("population_chart");
                if (graphStream != null) {
                    Image graph = new Image(graphStream);
                    gr.setImage(graph);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            if (conn != null) {
                try {
                    conn.close();
                    DBCN.closeConnection();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // to new entry page
    public void toNew(javafx.event.ActionEvent event) throws IOException {

        FXMLLoader entryload = new FXMLLoader(getClass().getResource("entry.fxml"));
        Scene map = new Scene(entryload.load());
        space = (Stage) ( (Node)event.getSource() ).getScene().getWindow();
        space.setScene(map);
        space.show();

    }

    // to add new entry
    public void addEntry(javafx.event.ActionEvent event) throws IOException {

        DatabaseConnection DBCN = new DatabaseConnection();
        Connection conn = DBCN.getConnection();

        String name = this.name.getText();
        String body = this.body.getText();
        String life = this.life.getText();
        String geo = this.geo.getText();
        String dos = this.dos.getText();
        String repro = this.repro.getText();
        String group = this.group.getText();
        String food = this.food.getText();
        Image photo = getPhoto();
        Image gr = getPhoto();

        InputStream photoStream = null;
        InputStream grStream = null;

        if (photo != null) {
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            ImageIO.write(SwingFXUtils.fromFXImage(photo, null), "png", os);
            photoStream = new ByteArrayInputStream(os.toByteArray());
        }

        if (gr != null) {
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            ImageIO.write(SwingFXUtils.fromFXImage(gr, null), "png", os);
            grStream = new ByteArrayInputStream(os.toByteArray());
        }

        try {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO alien_species (species_name, body_structure, lifespan, planet_geography, food_sources, group_organisation, reproduction, development_of_societies, image, population_chart) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, name);
            ps.setString(2, body);
            ps.setString(3, life);
            ps.setString(4, geo);
            ps.setString(5, food);
            ps.setString(6, group);
            ps.setString(7, repro);
            ps.setString(8, dos);

            if (photoStream != null) {
                ps.setBinaryStream(9, photoStream);
            } else {
                ps.setNull(9, java.sql.Types.BLOB);
            }

            if (grStream != null) {
                ps.setBinaryStream(10, grStream);
            } else {
                ps.setNull(10, java.sql.Types.BLOB);
            }

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            if (conn != null) {
                try {
                    conn.close();
                    DBCN.closeConnection();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        engage(event);
    }

    public void getPlanet(MouseEvent event) throws IOException {

        getSpecies(event);

        DatabaseConnection DBCN = new DatabaseConnection();
        Connection conn = DBCN.getConnection();

        String name = ((MenuItem)event.getSource()).getId();
        String query = "SELECT * FROM alien_species WHERE planet = " + "'" + name + "'";

        try {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(query);

            if (rs.next()) {
                bodyStructure.setText(rs.getString("body_structure"));
                lifespan.setText(rs.getString("lifespan"));
                planetGeography.setText(rs.getString("planet_geography"));
                foodSources.setText(rs.getString("food_sources"));
                groupOrganisation.setText(rs.getString("group_organisation"));
                reproduction.setText(rs.getString("reproduction"));
                DoS.setText(rs.getString("development_of_societies"));


                InputStream imageStream = rs.getBinaryStream("image");
                if (imageStream != null) {
                    Image image = new Image(imageStream);
                    photo.setImage(image);
                }

                InputStream graphStream = rs.getBinaryStream("population_chart");
                if (graphStream != null) {
                    Image graph = new Image(graphStream);
                    gr.setImage(graph);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            if (conn != null) {
                try {
                    conn.close();
                    DBCN.closeConnection();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}