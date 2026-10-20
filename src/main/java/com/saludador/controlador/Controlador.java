package com.saludador.controlador;

import com.saludador.modelo.Estudiante;
import com.saludador.servicio.Saludador;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextInputDialog;

import java.util.Optional;

/**
 * Gestiona las interacciones de la interfaz: pide datos, valida y muestra el saludo.
 */
public class Controlador {

    private static final String MENSAJE_CANCELADO =
            "Ingreso cancelado. Puedes hacer clic de nuevo en Solicitar saludo.";

    private final Saludador saludador = new Saludador();

    @FXML
    private Button btnSolicitarSaludo;

    @FXML
    private Label lblResultado;

    @FXML
    private void solicitarSaludo() {
        Optional<String> nombre = pedirNombre();
        if (nombre.isEmpty()) {
            mostrarMensaje(MENSAJE_CANCELADO);
            return;
        }

        Optional<Integer> edad = pedirEdad();
        if (edad.isEmpty()) {
            mostrarMensaje(MENSAJE_CANCELADO);
            return;
        }

        Optional<String> periodo = pedirPeriodo();
        if (periodo.isEmpty()) {
            mostrarMensaje(MENSAJE_CANCELADO);
            return;
        }

        Estudiante estudiante = new Estudiante(nombre.get(), edad.get(), periodo.get());
        mostrarMensaje(saludador.generarSaludo(estudiante));
    }

    private Optional<String> pedirNombre() {
        while (true) {
            TextInputDialog dialogo = new TextInputDialog();
            dialogo.setTitle("Solicitar saludo");
            dialogo.setHeaderText("Ingresa tus datos");
            dialogo.setContentText("Nombre del estudiante:");

            Optional<String> respuesta = dialogo.showAndWait();
            if (respuesta.isEmpty()) {
                return Optional.empty();
            }

            String nombre = respuesta.get().trim();
            if (!nombre.isEmpty()) {
                return Optional.of(nombre);
            }

            mostrarAlerta("El nombre no puede estar vacío. Inténtalo de nuevo.");
        }
    }

    private Optional<Integer> pedirEdad() {
        while (true) {
            TextInputDialog dialogo = new TextInputDialog();
            dialogo.setTitle("Solicitar saludo");
            dialogo.setHeaderText("Ingresa tus datos");
            dialogo.setContentText("Edad del estudiante:");

            Optional<String> respuesta = dialogo.showAndWait();
            if (respuesta.isEmpty()) {
                return Optional.empty();
            }

            String textoEdad = respuesta.get().trim();
            try {
                int edad = Integer.parseInt(textoEdad);
                if (edad > 0) {
                    return Optional.of(edad);
                }
                mostrarAlerta("La edad debe ser un número entero mayor que 0. Inténtalo de nuevo.");
            } catch (NumberFormatException excepcion) {
                mostrarAlerta("La edad debe ser un número entero válido. Inténtalo de nuevo.");
            }
        }
    }

    private Optional<String> pedirPeriodo() {
        ChoiceDialog<String> dialogo = new ChoiceDialog<>("AM", "AM", "PM");
        dialogo.setTitle("Solicitar saludo");
        dialogo.setHeaderText("Ingresa tus datos");
        dialogo.setContentText("Hora del día:");
        return dialogo.showAndWait();
    }

    private void mostrarMensaje(String mensaje) {
        lblResultado.setText(mensaje);
    }

    private void mostrarAlerta(String mensaje) {
        Alert alerta = new Alert(Alert.AlertType.WARNING, mensaje, ButtonType.OK);
        alerta.setTitle("Dato inválido");
        alerta.setHeaderText("No se pudo continuar con el dato ingresado");
        alerta.showAndWait();
    }
}
