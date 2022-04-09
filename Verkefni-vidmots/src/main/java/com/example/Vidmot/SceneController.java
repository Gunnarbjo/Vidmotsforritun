package com.example.Vidmot;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class SceneController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToSceneStjornandi(ActionEvent actionEvent) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("stjornandi-view.fxml")));
        stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene((root));
        stage.setTitle("Bingo stjórn");
        stage.setScene(scene);
        stage.show();
    }
    public void switchToSceneSpjoldVal(ActionEvent actionEvent) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("spjoldVal-view.fxml")));
        stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene((root));
        stage.setTitle("Val á fjölda spjada");
        stage.setScene(scene);
        stage.show();
    }

    public void switchToSceneEittSpjald(ActionEvent actionEvent) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("bingo-view.fxml")));
        stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene((root));
        stage.setTitle("Eitt bingóspjald");
        stage.setScene(scene);
        stage.show();
    }
    public void switchToSceneTvoSpjold(ActionEvent actionEvent) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("bingo2-view.fxml")));
        stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene((root));
        stage.setTitle("Tvö bingóspjöld");
        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.show();
    }
    public void switchToSceneThrjuSpjold(ActionEvent actionEvent) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("bingo3-view.fxml")));
        stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene((root));
        stage.setTitle("Þrjú bingóspjöld");
        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.show();
    }
    public void switchToSceneBingo(ActionEvent actionEvent) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("bingoBingo-view.fxml")));
        stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene((root));
        stage.setTitle("Tvö bingóspjald");
        stage.setScene(scene);
        stage.show();
    }
    public void switchToSceneStart(ActionEvent actionEvent) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("start-view.fxml")));
        stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene((root));
        stage.setTitle("Bingo!!");
        stage.setScene(scene);
        stage.show();
    }
    public void closeButtonAction(ActionEvent actionEvent){
        // get a handle to the stage
        stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        // do what you have to do
        stage.close();
    }
}
