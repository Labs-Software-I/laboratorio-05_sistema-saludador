package com.saludador.servicio;

import com.saludador.modelo.Estudiante;

/**
 * Construye el mensaje de saludo a partir de los datos del estudiante.
 */
public class Saludador {

    public String generarSaludo(Estudiante estudiante) {
        String saludoSegunHora = elegirSaludo(
                estudiante.getHora(),
                estudiante.getPeriodo()
        );

        return saludoSegunHora + ", " + estudiante.getNombre()
                + ". Tienes " + estudiante.getEdad() + " años.";
    }

    /**
     * Buenos días: 5:00 a. m. – 11:59 a. m.
     * Buenas tardes: 12:00 p. m. – 6:59 p. m.
     * Buenas noches: 7:00 p. m. – 4:59 a. m.
     */
    private String elegirSaludo(int hora12, String periodo) {
        int hora24 = aHora24(hora12, periodo);

        if (hora24 >= 5 && hora24 < 12) {
            return "Buenos días";
        }
        if (hora24 >= 12 && hora24 < 19) {
            return "Buenas tardes";
        }
        return "Buenas noches";
    }

    private int aHora24(int hora12, String periodo) {
        boolean esAm = "AM".equalsIgnoreCase(periodo);
        if (esAm) {
            return hora12 == 12 ? 0 : hora12;
        }
        return hora12 == 12 ? 12 : hora12 + 12;
    }
}
