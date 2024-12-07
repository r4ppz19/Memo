package com.r4ppz.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class AlertViewController {
    @FXML
    private Button okButton;

    @FXML
    public void okButtonAction(ActionEvent actionEvent) {
        Stage alerStage = (Stage) okButton.getScene().getWindow();
        alerStage.close();
    }
    
}
