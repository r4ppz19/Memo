package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class MainController {
    @FXML
    private Button button;
    @FXML
    private TextArea mainTextArea;

    @FXML
    public void saveButtonAction(ActionEvent event) {
        String temp = mainTextArea.getText();
        System.out.println(temp);
    }
}
