package com.saludador.modelo;

/**
 * Representa los datos que ingresa el estudiante para recibir un saludo.
 */
public class Estudiante {

    private final String nombre;
    private final int edad;
    private final int hora;
    private final int minutos;
    private final String periodo;

    public Estudiante(String nombre, int edad, int hora, int minutos, String periodo) {
        this.nombre = nombre;
        this.edad = edad;
        this.hora = hora;
        this.minutos = minutos;
        this.periodo = periodo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getHora() {
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public String getPeriodo() {
        return periodo;
    }
}
