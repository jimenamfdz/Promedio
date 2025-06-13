package mx.edu.utez.u2_t1_05_creacionform;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

import javafx.scene.layout.GridPane;
import javafx.stage.Stage;




import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
       //FXMLLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
       Label lblNombre = new Label("Nombre: ");
       TextField tfNombre = new TextField();
       Label lblApellido = new Label("Apellido: ");
       TextField tfApellido = new TextField();
       Label lblEdad = new Label("Edad: ");
       TextField tfEdad = new TextField();
       Label lblRol = new Label("Rol: ");
       ObservableList<String> Rol = FXCollections.observableArrayList("Estudiante");
       ComboBox<String> cbRol = new ComboBox<>(Rol);
       Button btnCrear = new Button("Creador");
       Button btnReset = new Button("Rest");
       Label lblResultado = new Label("Resultado");
       GridPane grid = new GridPane();



       btnCrear.setOnAction(e -> {
           if(tfNombre.getText().isEmpty() || tfApellido.getText().isEmpty() || tfEdad.getText().isEmpty()) {
               lblResultado.setText("Llene todo los campos");
           }
           else {
               lblResultado.setText("Nombre"+tfNombre.getText() + "Nombre"+ tfApellido.getText() + "Apellido" + tfEdad.getText());
               grid.setStyle("-fx-background-color: green;");
               lblResultado.setStyle("-fx-text-fill: rgba(0,255,255,0.99);");
           }});





       grid.setHgap(10);
       grid.setVgap(10);
       grid.add(lblNombre, 0, 0);
       grid.add(tfNombre, 1, 0);
       grid.add(lblApellido, 0,1);
       grid.add(tfApellido,1,1);
       grid.add(lblEdad, 0,2);
       grid.add(tfEdad, 1,2);
       grid.add(lblRol, 0, 3);
       grid.add(cbRol, 1,3);
       grid.add(btnCrear, 0, 4);
       grid.add(btnReset,1,4);
       grid.add(lblResultado,0,5,2,1);
       Scene scene = new Scene(grid, 600, 550);
        stage.setTitle("Formulario");
        stage.setScene(scene);
        stage.show();

    }



    public static void main(String[] args) {
        launch();
    }
}