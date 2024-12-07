package com.r4ppz.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import com.r4ppz.util.GetTimeDate;
import com.r4ppz.util.ImportExportData;
import com.r4ppz.view.AlertWindow;
//import com.r4ppz.view.TestWindow;

public class MainViewController {
    private ImportExportData importExportData = new ImportExportData();
    private GetTimeDate getTimeDate = new GetTimeDate();
    private AlertWindow alertWindow = new AlertWindow();

    //private TestWindow testWindow = new TestWindow();


    @FXML
    private Button saveButton;
    @FXML
    private TextArea mainTextArea;

    /*
     * Handle save buttom
     * Get the text in the text area and save it in the model class
     */
    public void saveButtonAction(ActionEvent event) throws Exception{
        if (!mainTextArea.getText().isEmpty()) {
            importExportData.dataModel.setTime(getTimeDate.getCurrentTime());
            importExportData.dataModel.setDate(getTimeDate.getCurrentDate());
            importExportData.dataModel.setTxt(mainTextArea.getText());
            mainTextArea.clear();
            alertWindow.showAlert();
            
            importExportData.exportData();

            //testWindow.showTestWindow();
        } else {
            System.out.println("mainTextArea is empty");
        }
    }

    
    /*
     * Handle export button
     * Export details into a txt file
     */
    public void exportButtonAction(ActionEvent event) {
        if (importExportData.dataModel.getTxt() != null && !importExportData.dataModel.getTxt().isEmpty()) {
            importExportData.exportData();
        } else {
            System.out.println("txt variable is either null or empty");
        }
        
    }
}
