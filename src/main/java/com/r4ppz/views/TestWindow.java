package com.r4ppz.views;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TestWindow {

    public void showTestWindow() {
        Stage primaryStage = new Stage();
        primaryStage.setTitle("My Awesome Window");

        Pane pane = new Pane();
        pane.setPrefSize(984, 496);
        pane.setStyle("-fx-background-color: #eeeeee;");

        Label element2 = new Label("Welcome");
        element2.setLayoutX(360.95626068115234);
        element2.setLayoutY(15.993751525878906);
        element2.setPrefWidth(220);
        element2.setPrefHeight(88);
        element2.setFont(Font.loadFont(getClass().getResourceAsStream("/fonts/Lexend.ttf"), 50.00));
        element2.setStyle("-fx-text-fill: #1b1b1b;");
        pane.getChildren().add(element2);

        PasswordField element3 = new PasswordField();
        element3.setText("");
        element3.setLayoutX(359.99);
        element3.setLayoutY(174.59);
        element3.setPrefWidth(217.00);
        element3.setPrefHeight(24.00);
        element3.setPromptText("");
        element3.setFont(Font.loadFont(getClass().getResourceAsStream("/fonts/Lexend.ttf"), 14.00));
        element3.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #1b1b1b; -fx-border-color: #626262; -fx-border-width: 1px; -fx-border-radius: 2px; -fx-prompt-text-fill: #737674;");
        pane.getChildren().add(element3);

        TextArea element4 = new TextArea("");
        element4.setLayoutX(271.97);
        element4.setLayoutY(98.96);
        element4.setPrefWidth(399.00);
        element4.setPrefHeight(191.00);
        element4.setPromptText("");
        element4.setFont(Font.loadFont(getClass().getResourceAsStream("/fonts/Lexend.ttf"), 14.00));
        element4.setStyle("-fx-control-inner-background: #ffffff; -fx-background-color: #ffffff; -fx-text-fill: #1b1b1b; -fx-border-color: #626262; -fx-border-width: 1px; -fx-border-radius: 2px; -fx-prompt-text-fill: #737674;");
        pane.getChildren().add(element4);

        Button element5 = new Button("Save");
        element5.setLayoutX(413.17);
        element5.setLayoutY(324.00);
        element5.setPrefWidth(105.83);
        element5.setPrefHeight(30.38);
        element5.setDisable(false);
        element5.setFont(Font.loadFont(getClass().getResourceAsStream("/fonts/Lexend.ttf"), 14.00));
        element5.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #1b1b1b; -fx-border-color: #626262; -fx-border-radius: 4px; -fx-background-radius: 4px; -fx-border-width: 1px;");
        element5.addEventFilter(MouseEvent.MOUSE_PRESSED, e -> { element5.setBackground(new Background(new BackgroundFill(Color.web("#c2c2c2"), new CornerRadii(4.00), null))); });
        element5.addEventFilter(MouseEvent.MOUSE_RELEASED, e -> { element5.setBackground(new Background(new BackgroundFill(Color.web("#ffffff"), new CornerRadii(4.00), null))); });
        pane.getChildren().add(element5);

        Scene scene = new Scene(pane, 984, 496);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
