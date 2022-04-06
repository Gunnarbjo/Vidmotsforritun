package com.example.Vidmot;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class StjornandiController implements StjornandiControllerInterface {
    private Scene scene;
    private Stage stage;
    @FXML
    private Button stjornandi;

    @FXML
    private Pane stjorn;

    @Override
    public void initializeStjorn(URL url, ResourceBundle resourceBundle) {
        scene = new Scene(stjorn);
        stjornandi.setVisible(true);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @Override
    public void birtaStjornGlugga() {
        Stage stage = new Stage();
        stage.setTitle("Rúllum kúlum");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void birtaGlugga() {

    }


}
