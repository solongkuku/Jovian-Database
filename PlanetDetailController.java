package skymap;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PlanetDetailController {
    @FXML private Label planetName;
    @FXML private Text planetDetails;
    @FXML private Button closeButton;
    
    public void setPlanetData(Planet planet) {
        planetName.setText(planet.getName());
        planetDetails.setText(planet.getDetails());
    }
    
    @FXML
    private void handleClose() {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }
}