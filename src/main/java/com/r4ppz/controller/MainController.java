package com.r4ppz.controller;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import com.r4ppz.model.MainModel;
import com.r4ppz.util.GetTimeDate;
import com.r4ppz.util.ImportExport;
import com.r4ppz.views.AlertWindow;
import com.r4ppz.views.TestWindow;

public class MainController {
    private MainModel mainModel = new MainModel();
    private GetTimeDate getTimeDate = new GetTimeDate();
    private ImportExport importExport = new ImportExport();
    private AlertWindow alertWindow = new AlertWindow();
    
    private TestWindow testWindow = new TestWindow();

    @FXML
    private Button saveButton;
    @FXML
    private Button exportButton;
    @FXML
    private TextArea mainTextArea;

    /*
     * Handle save buttom
     * Get the text in the text area and save it in the model class
     */
    public void saveButtonAction(ActionEvent event) throws Exception{
        mainModel.setTime(getTimeDate.getCurrentTime());
        mainModel.setDate(getTimeDate.getCurrentDate());
        mainModel.setTxt(mainTextArea.getText());
        mainTextArea.clear();
        alertWindow.showAlert();
        testWindow.showTestWindow();

    }

    
    /*
     * Handle export button
     * Export details into a txt file
     */
    public void exportButtonAction(ActionEvent event) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("data.txt", true));
            writer.write(getTimeDate.getCurrentDate());
            writer.newLine();
            writer.write(getTimeDate.getCurrentTime());
            writer.newLine();
            writer.write(mainModel.getTxt());
            writer.newLine();
            writer.newLine();
            writer.close();
            importExport.importData();
        } catch (IOException e) {
            System.out.println("IO EXCEPTION !!! WHOOO HOOO");
        }
    }
}
