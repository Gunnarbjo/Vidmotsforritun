package com.example.Vidmot;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class SpjoldValController implements Initializable, SpjoldValControllerInterface {
    private Scene scene;
    @FXML
    private Button stjornandi;
    @FXML
    private Button spilari;

    @FXML
    private Pane Valspj;

    @FXML
    private Pane stjorn;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        scene = new Scene(stjorn);
        stjornandi.setVisible(true);
    }
    @Override
    public void initializespilari(URL url, ResourceBundle resourceBundle) {
        scene = new Scene(Valspj);
        spilari.setVisible(true);
    }
    public void birtaGlugga() {
        Stage stage = new Stage();
        stage.setTitle("Velja Spjöld");
        stage.setScene(scene);
        stage.show();
    }

    public void birtaStjornGlugga() {
        Stage stage = new Stage();
        stage.setTitle("Rúllum kúlum");
        stage.setScene(scene);
        stage.show();
    }
}
