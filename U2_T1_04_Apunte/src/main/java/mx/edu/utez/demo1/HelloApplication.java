package mx.edu.utez.demo1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        Label label = new Label("Label 1");
        Label label2 = new Label("Label2");
        Button button = new Button("Button Aceptar");
        Button button2 = new Button("Button Cancelar");

        button.setOnAction(e -> {
            label.setText("Aceptado");
        });

        button.setOnAction(e -> {
            label2.setText("Cancelado");
    });

        VBox vbox = new VBox(20,label, label2,button, button2);
        vbox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vbox, 500, 240);

        stage.setTitle("Hello");
        //Image image = new Image(getClass().getResourceAsStream("images/aim_3594510.png"));
        //stage.getIcons().add(image);
        stage.setScene(scene);
        stage.show();
        }
    public static void main(String[] args) {
        launch();
    }
}