package com.example.lab3jatinkumar;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    public Button loginbttn;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        try {
            // Load the FXML file for the second scene
            Parent secondScene = FXMLLoader.load(getClass().getResource("Dashboard-view.fxml"));

            // Create a new stage for the second scene
            Stage secondStage = new Stage();
            secondStage.setTitle("User Scene");
            secondStage.setScene(new Scene(secondScene));

            Stage firstSceneStage = (Stage) loginbttn.getScene().getWindow();
            firstSceneStage.close();




            // Show the second stage
            secondStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        };
    }
}