package model;

import java.util.Objects;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class AlertLoader {

    public void showAlert() throws Exception{
        Image mainIcon = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/image/TTIcon.png")));
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/fxml/AlertView.fxml")));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.getIcons().add(mainIcon);
        stage.setResizable(false);
        stage.show();
    }
    
}
