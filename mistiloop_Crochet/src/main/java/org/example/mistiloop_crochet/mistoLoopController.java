package org.example.mistiloop_crochet;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class mistoLoopController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}