package com.example.ex1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;



public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        GridPane gridPane = new GridPane();
        Scene scene = new Scene(gridPane, 1200, 650);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(25, 25, 25, 25));
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        Image vert = new Image("C:\\Vlad\\GD2\\GrandDevoir2\\Ex1\\src\\main\\resources\\Pics\\craneUp.png");
        ImageView vertIV = new ImageView(vert);

        gridPane.add(vertIV,0,0);
        //vertIV.setPreserveRatio(true);
        vertIV.setFitHeight(325);




    }

    public static void main(String[] args) {
        launch();
    }


}