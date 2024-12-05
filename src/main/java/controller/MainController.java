package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainController {
    @FXML
    private Button button;

    @FXML
    public void saveButtonAction(ActionEvent event) {
        System.out.println("File has been saved...");
    }
}
