package skymap;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PlanetController {
    @FXML private Pane universePane;
    
    private List<Planet> planets = new ArrayList<>();
    
    @FXML
    public void initialize() {
        // Initialize planet data (could be loaded from database)
        planets.add(new Planet("Mercury", 100, 150, 15, "#A9A9A9", "Mercury details..."));
        planets.add(new Planet("Venus", 250, 200, 20, "#FFA500", "Venus details..."));
        planets.add(new Planet("Earth", 400, 180, 22, "#1E90FF", "Earth details..."));
        planets.add(new Planet("Mars", 550, 220, 18, "#FF4500", "Mars details..."));
        planets.add(new Planet("Jupiter", 300, 350, 35, "#F4A460", "Jupiter details..."));
        planets.add(new Planet("Saturn", 500, 400, 30, "#DAA520", "Saturn details..."));
        planets.add(new Planet("Uranus", 200, 450, 25, "#ADD8E6", "Uranus details..."));
        planets.add(new Planet("Neptune", 400, 500, 25, "#0000FF", "Neptune details..."));
        
        // Create and position planets
        for (Planet planet : planets) {
            createPlanet(planet);
        }
    }
    
    private void createPlanet(Planet planet) {
        Circle circle = new Circle();
        circle.setCenterX(planet.getX());
        circle.setCenterY(planet.getY());
        circle.setRadius(planet.getRadius());
        circle.getStyleClass().add("planet");
        circle.setStyle("-fx-fill: " + planet.getColor() + ";");
        
        // Add planet name
        Text nameLabel = new Text(planet.getName());
        nameLabel.setX(planet.getX() - nameLabel.getLayoutBounds().getWidth()/2);
        nameLabel.setY(planet.getY() - planet.getRadius() - 5);
        nameLabel.getStyleClass().add("planet-name");
        
        // Set click handler
        circle.setOnMouseClicked(event -> showPlanetDetails(planet));
        
        universePane.getChildren().addAll(circle, nameLabel);
    }
    
    private void showPlanetDetails(Planet planet) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("planetdetail.fxml"));
            Parent root = loader.load();
            
            PlanetDetailController controller = loader.getController();
            controller.setPlanetData(planet);
            
            Stage stage = new Stage();
            stage.setTitle(planet.getName() + " Details");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}