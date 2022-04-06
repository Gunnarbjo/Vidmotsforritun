package com.example.Vidmot;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class StartController {
    public Pane Vhlutverk;
    public Button stjornandi;
    public Button spilari;
    private SpjoldValController spjold;
    private SpjoldValController stjornSpjold;

    private SpjoldValController hladaSpjold() throws java.io.IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("spjoldVal-view.fxml"));
        loader.load();
        return loader.getController();
    }
    private StjornandiController birtaStjornGlugga() throws java.io.IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("stjornandi-view.fxml"));
        loader.load();
        return loader.getController();
    }


    public void spilaHandler(ActionEvent actionEvent) {
        try{
            spjold = hladaSpjold();
        }catch (IOException e){
            e.printStackTrace();
        }
        spjold.birtaGlugga();
    }
    public void stjornaHandler(ActionEvent actionEvent) {
        try{
            stjornSpjold = hladaSpjold();
        }catch (IOException e){
            e.printStackTrace();
        }
        stjornSpjold.birtaStjornGlugga();
    }
}
