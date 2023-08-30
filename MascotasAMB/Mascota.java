package MascotasAMB;

import Personas.Persona;

public  abstract  class Mascota {

    private String nombre;

    private Persona dueño;

    public Mascota(String nombre, Persona dueño) {
        this.nombre = nombre;
        this.dueño = dueño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona getDueño() {
        return dueño; // hola
    }

    public void setDueño(Persona dueño) {
        this.dueño = dueño;
    }

    public abstract void saludar(Persona dueño, Mascota mascota);

    public abstract void alimentar();



}
