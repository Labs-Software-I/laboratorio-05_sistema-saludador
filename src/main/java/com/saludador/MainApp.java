package com.saludador;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Punto de entrada de la aplicación JavaFX.
 */
public class MainApp extends Application {

    @Override
    public void start(Stage escenarioPrincipal) throws IOException {
        FXMLLoader cargador = new FXMLLoader(MainApp.class.getResource("/com/saludador/vista.fxml"));
        Parent raiz = cargador.load();

        escenarioPrincipal.setTitle("Sistema saludador");
        escenarioPrincipal.setScene(new Scene(raiz, 520, 280));
        escenarioPrincipal.setResizable(false);
        escenarioPrincipal.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
