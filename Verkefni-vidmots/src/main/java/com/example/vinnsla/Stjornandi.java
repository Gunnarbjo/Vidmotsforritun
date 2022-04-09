package com.example.vinnsla;


import com.example.Vidmot.SceneController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;


public class Stjornandi implements BingostjornInterface{
    private final Boolean[] checked = new Boolean[5];
    @FXML
    private Label byrtaKulu;
    @FXML
    private Label byrtaLitarod;
    @FXML
    private CheckBox B;
    @FXML
    private CheckBox I;
    @FXML
    private CheckBox N;
    @FXML
    private CheckBox G;
    @FXML
    private CheckBox O;

    private final ArrayList<Integer> buid = new ArrayList<>();

   private final ArrayList<Integer> litarod = new ArrayList<>();

   public void setjaIlitarod(){
       for(int i = 1; i < 75;i++){
           litarod.add(i);
       }
   }

    public void byrtaLitarod(){
        byrtaLitarod.setText(String.valueOf(litarod));
    }
    public void buinTala(){
       if(buid.contains(litarod)){

       }
    }

    public Stjornandi() {
    }

    public void isChecked(){
       checked[0] = B.isSelected();
       checked[1] = I.isSelected();
       checked[2] = N.isSelected();
       checked[3] = G.isSelected();
       checked[4] = O.isSelected();
    }

    private ArrayList<Integer> availableNumbers(){
        int[] bFylki = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int[] iFylki = {16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
        int[] nFylki = {31,32,33,34,35,36,37,38,39,40,41,42,43,44,45};
        int[] gFylki = {46,47,48,49,50,51,52,53,54,55,56,57,58,59,60};
        int[] oFylki = {61,62,63,64,65,66,67,68,69,70,71,72,73,74,75};


        ArrayList<Integer> available = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            if (checked[i])
                switch (i) {
                    case 0 -> available.addAll(Arrays.stream(bFylki).boxed().toList());
                    case 1 -> available.addAll(Arrays.stream(iFylki).boxed().toList());
                    case 2 -> available.addAll(Arrays.stream(nFylki).boxed().toList());
                    case 3 -> available.addAll(Arrays.stream(gFylki).boxed().toList());
                    case 4 -> available.addAll(Arrays.stream(oFylki).boxed().toList());
                }
        }
        buid.forEach(available::remove);
        return available;
    }

    public int nyKula() {
        ArrayList<Integer> eftir = availableNumbers();
        int index = (int)(Math.random() * eftir.size());
        int tala = eftir.get(index);
        buid.add(tala);
        return tala;
    }

    public void byrtaKulu(ActionEvent actionEvent){
        int kula = nyKula();
        String rod = "";
        if(kula <= 15) {rod = "B";}
        else if(kula <= 30) rod = "I";
        else if(kula <= 45) rod = "N";
        else if(kula <= 60) rod = "G";
        else rod = "O";
        byrtaKulu.setText(rod + String.valueOf((kula)));
    }
    public void hreinsaBord(){
        buid.clear();
    }


    public void switchToSceneStart(ActionEvent actionEvent) throws IOException {
        SceneController sc = new SceneController();
        sc.switchToSceneStart(actionEvent);
    }
    public  void closeButtonAction(ActionEvent actionEvent){
        SceneController sc = new SceneController();
        sc.closeButtonAction(actionEvent);
    }

}


