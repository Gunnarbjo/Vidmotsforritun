module com.example.bingo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.Vidmot to javafx.fxml;
    exports com.example.Vidmot;
    exports com.example.vinnsla;
    opens com.example.vinnsla to javafx.fxml;
}