package com.saludador.servicio;

import com.saludador.modelo.Estudiante;

/**
 * Construye el mensaje de saludo a partir de los datos del estudiante.
 */
public class Saludador {

    public String generarSaludo(Estudiante estudiante) {
        String saludoSegunHora = esPeriodoAm(estudiante.getPeriodo())
                ? "Buenos días"
                : "Buenas tardes";

        return saludoSegunHora + ", " + estudiante.getNombre()
                + ". Tienes " + estudiante.getEdad() + " años.";
    }

    private boolean esPeriodoAm(String periodo) {
        return "AM".equalsIgnoreCase(periodo);
    }
}
