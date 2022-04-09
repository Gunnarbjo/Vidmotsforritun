/***
 * Nafn:  Gunnar Björn Þrastarson
 * email: gbt6@hi.is
 *
 * Lýsing: Viðmótsklasi sem setur tölur á takkana og athugar
 *         hvort að komið sé bingó.
 */

package com.example.Vidmot;

import com.example.vinnsla.Bingospjald;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class BingoController implements Initializable {

    public Label fxLabel;
    public Label fxLabel2;
    private Bingospjald spjald;

    @FXML
    private GridPane fxGrid;
    @FXML
    public GridPane fxGrid2;
    @FXML
    public GridPane fxGrid3;


    /**
     * Setur tölur á takkana í Bingó
     * @param url Vísun í FXML skjal
     * @param resourceBundle Heldur utan um hvað er í tökkunu
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        fxLabel.setManaged(false);
        spjald = new Bingospjald();
        ObservableList<Node> children = fxGrid.getChildren();
        int[][] bSpjald = spjald.getSpjald();
        int index = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                Button b = (Button) children.get(index);
                b.setText(String.valueOf(bSpjald[j][i]));
                index++;
            }
        }
        if(fxGrid2 == null) return;
        spjald = new Bingospjald();
        ObservableList<Node> children2 = fxGrid2.getChildren();
        int[][] b2Spjald = spjald.getSpjald();
        index = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                Button b = (Button) children2.get(index);
                b.setText(String.valueOf(b2Spjald[j][i]));
                index++;
            }
        }
        if(fxGrid3 == null) return;
        spjald = new Bingospjald();
        ObservableList<Node> children3 = fxGrid3.getChildren();
        int[][] b3Spjald = spjald.getSpjald();
        index = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                Button b = (Button) children3.get(index);
                b.setText(String.valueOf(b3Spjald[j][i]));
                index++;
            }
        }


    }
    /**
     *Skoðar virkni í spjaldinu og
     * Breytir um bakgrunn onClick,
     * Sendir staðsetningu á takkanum til aReit,
     * talar við erBingo hvort að það sé Bingó,
     * Birtir skilaboð þegar það er komið Bingó
     * @param actionEvent Þegar ýtt er á takka
     */
    public void bingoHandler(ActionEvent actionEvent) {

        Button b = ((Button) actionEvent.getSource());
        b.setStyle("-fx-background-color: #FF0000");
        b.setDisable(true);
        fxGrid.requestFocus();

        int row = GridPane.getRowIndex(b)-1;
        Integer column = GridPane.getColumnIndex(b);
        //column gildi fyrir B er alltaf null
        if(column == null) column = 0;
        spjald.aReit(row, column);

        if (spjald.erBingo()) {
            fxLabel.setManaged(true);
            fxLabel.setVisible(true);

        }

    }

    public void switchToSceneStart(ActionEvent actionEvent) throws IOException {
        SceneController sc = new SceneController();
        sc.switchToSceneStart(actionEvent);
    }
    public void switchToSceneSpjoldVal(ActionEvent actionEvent) throws IOException {
        SceneController sc = new SceneController();
        sc.switchToSceneSpjoldVal(actionEvent);
    }
}
