package figuresfx.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class MainScreenController implements Initializable {

    @FXML
    private Canvas canvas;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("MainScreenController");

    }

    @FXML
    private void onMoseClicked(MouseEvent mouseEvent) {
    }
}
