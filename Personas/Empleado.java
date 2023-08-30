package Personas;

import Fecha.Fecha;

public class Empleado extends Persona {

    int dni;

    String pais;

    int numeroTelefono;

public Empleado(){
    super();
    dni = 23434;
    pais = "Argentina";
    numeroTelefono = 293482;
}
    public Empleado(String nombre, String direccion, int edad, int dni, String pais, int numeroTelefono) {
        super(nombre, direccion, edad);
        this.dni = dni;
        this.pais = pais;
        this.numeroTelefono = numeroTelefono;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
}
