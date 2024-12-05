package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import model.MainModel;

public class MainController {
    private MainModel mainModel = new MainModel();

    @FXML
    private Button saveButton;
    @FXML
    private Button exportButton;
    @FXML
    private TextArea mainTextArea;

    @FXML
    public void saveButtonAction(ActionEvent event){
        mainModel.setTime(mainModel.getCurrentTime());
        mainModel.setDate(mainModel.getCurrentDate());
        mainModel.setTxt(mainModel.getTxt());
    }

    @FXML
    public void exportButtonAction(ActionEvent event) {
        
    }


}
