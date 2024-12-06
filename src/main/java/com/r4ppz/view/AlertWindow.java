package com.r4ppz.view;

import java.util.Objects;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertWindow {

    // Display AlertView method
    public void showAlert() throws Exception{
        Image mainIcon = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/image/TTIcon.png")));
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/AlertView.fxml")));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.getIcons().add(mainIcon);
        stage.setResizable(false);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.showAndWait();
    }
    
}
