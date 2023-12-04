package com.example.demo4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class App extends Application {

 private  Stage window;
    @Override
    public void start(Stage stage) throws IOException {
        URL file = new File("/Users/").toURI().toURL();
        Parent root = FXMLLoader.load(file);
       stage.setTitle("Shopping cart");
       stage.setScene(new Scene(root, Color.TRANSPARENT));
        stage.initStyle(StageStyle.TRANSPARENT);
        makeDraggable(root);
       stage.show();
        window = stage;
}

    private void makeDraggable(Parent root) {
    }

    public static void main(String[] args) {
        launch();
    }


    public static Stage getWindow() {
        return this.window;
    }


    }
