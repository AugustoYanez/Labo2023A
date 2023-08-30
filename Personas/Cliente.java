package Personas;

import Fecha.Fecha;

public class Cliente extends Persona{

    int cuil;


    public Cliente() {
        super();
        cuil = 0;
    }

    public Cliente(String nombre, String direccion, int edad, int cuil) {
        super(nombre, direccion, edad);
        this.cuil = cuil;
    }

    public int getCuil() {
        return cuil;
    }

    public void setCuil(int cuil) {
        this.cuil = cuil;
    }
}
