package model;

import java.util.Objects;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Image mainIcon = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/image/TTIcon.png")));
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/fxml/MainView.fxml")));
        Scene scene = new Scene(root);
        primaryStage.getIcons().add(mainIcon);
        primaryStage.setTitle("Thought-Track");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}