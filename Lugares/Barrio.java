package Lugares;

import java.util.ArrayList;

public class Barrio extends Lugar {

    private int poblacion; // cant habs


    public Barrio(String nombre, int codigo, ArrayList<Coordenadas> cordenadas, int poblacion) {
        super(nombre, codigo, cordenadas);
        this.poblacion = poblacion;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }



}
