package controller;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class MainController {
    @FXML
    private Button button;
    @FXML
    private TextArea mainTextArea;

    boolean oneTry = true;


    @FXML
    public void saveButtonAction(ActionEvent event) throws IOException{
        saveFile();
    }

    // Save file method
    private void saveFile() throws IOException{
        if (oneTry) {
            BufferedWriter writer = new BufferedWriter(new FileWriter("data.txt"));
            writer.write(mainTextArea.getText());
            writer.close();
            mainTextArea.clear();
            oneTry = false;
        } else {
            System.out.println("FUCK! IT DID NOT WORK");
        }
    }
}
