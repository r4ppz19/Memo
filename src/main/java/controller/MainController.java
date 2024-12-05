package controller;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

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
    public void exportButtonAction(ActionEvent event) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("data.txt", true));
        writer.write(mainModel.getCurrentDate());
        writer.newLine();
        writer.write(mainModel.getCurrentTime());
        writer.newLine();
        writer.write(mainModel.getTxt());
        writer.close();
    }


}
