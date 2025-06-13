package mx.edu.utez.demo1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClicked() {
        welcomeText.setText("Welcome to my JavaFX Application");
    }
}