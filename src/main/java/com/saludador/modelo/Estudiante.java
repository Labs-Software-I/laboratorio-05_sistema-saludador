package com.saludador.modelo;

/**
 * Representa los datos que ingresa el estudiante para recibir un saludo.
 */
public class Estudiante {

    private final String nombre;
    private final int edad;
    private final String periodo;

    public Estudiante(String nombre, int edad, String periodo) {
        this.nombre = nombre;
        this.edad = edad;
        this.periodo = periodo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getPeriodo() {
        return periodo;
    }
}
