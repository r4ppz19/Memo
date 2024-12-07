package com.r4ppz.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import com.r4ppz.model.DataModel;
import com.r4ppz.util.GetTimeDate;
import com.r4ppz.util.ImportExport;
import com.r4ppz.view.AlertWindow;
import com.r4ppz.view.TestWindow;

public class DataController {
    private DataModel dataModel = new DataModel();
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
        if (!mainTextArea.getText().isEmpty()) {
            dataModel.setTime(getTimeDate.getCurrentTime());
            dataModel.setDate(getTimeDate.getCurrentDate());
            dataModel.setTxt(mainTextArea.getText());
            mainTextArea.clear();
            alertWindow.showAlert();
            testWindow.showTestWindow();
        } else {
            System.out.println("mainTextArea is empty");
        }
    }

    
    /*
     * Handle export button
     * Export details into a txt file
     */
    public void exportButtonAction(ActionEvent event) {
        if (dataModel.getTxt() == null) {
            System.out.println("DO DID NOT FUCKING WRITE ANYTHING");
        } else {
            importExport.exportData();
        }
        
    }
}
