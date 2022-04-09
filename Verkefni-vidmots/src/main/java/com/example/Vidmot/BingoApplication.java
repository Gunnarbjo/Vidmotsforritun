/***
 * Nafn:  Gunnar Björn Þrastarson
 * email: gbt6@hi.is
 *
 * Lýsing: Klasi sem sér um að starta FXML og keyra forritið í gang
 */

package com.example.Vidmot;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class BingoApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(BingoApplication.class.getResource("start-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Bingo!!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}