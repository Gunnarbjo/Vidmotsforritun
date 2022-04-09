package com.example.Vidmot;

import com.example.vinnsla.Stjornandi;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class StjornandiController implements Initializable {
    @FXML
    private Label byrtaKulu;

    private Stjornandi stjornandi;

    public StjornandiController() {
         stjornandi = new Stjornandi();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

   /*public void byrtaKulu(ActionEvent actionEvent){
       stjornandi.byrtaKulu(actionEvent);
    }*/
}
