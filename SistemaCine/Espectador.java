package SistemaCine;

import Fecha.Fecha;
import Personas.Persona;

import java.util.HashSet;

public class Espectador extends Persona {

    private int identificador;

    private String emailRegistrado;

    private HashSet<Funcion> historialFunciones;


    public Espectador(String nombre, String apellido, int dni, Fecha nacimienton, int identificador, String emailRegistrado, HashSet<Funcion> historialFunciones) {
        super(nombre, apellido, dni, nacimienton);
        this.identificador = identificador;
        this.emailRegistrado = emailRegistrado;
        this.historialFunciones = historialFunciones;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getEmailRegistrado() {
        return emailRegistrado;
    }

    public void setEmailRegistrado(String emailRegistrado) {
        this.emailRegistrado = emailRegistrado;
    }

    public HashSet<Funcion> getHistorialFunciones() {
        return historialFunciones;
    }

    public void setHistorialFunciones(HashSet<Funcion> historialFunciones) {
        this.historialFunciones = historialFunciones;
    }


}
