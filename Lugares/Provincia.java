package Lugares;

import java.util.ArrayList;
import java.util.HashSet;

public class Provincia extends Lugar  {

    HashSet<Ciudad> ciudadesQueLaComponen;

    public Provincia(String nombre, int codigo, ArrayList<Coordenadas> cordenadas, HashSet<Ciudad> ciudadesQueLaComponen) {
        super(nombre, codigo, cordenadas);
        this.ciudadesQueLaComponen = ciudadesQueLaComponen;
    }

    public HashSet<Ciudad> getCiudadesQueLaComponen() {
        return ciudadesQueLaComponen;
    }

    public void setCiudadesQueLaComponen(HashSet<Ciudad> ciudadesQueLaComponen) {
        this.ciudadesQueLaComponen = ciudadesQueLaComponen;
    }


    public int poblacioEnProvincia(){
        int sumaHabitantes = 0;
        for( Ciudad x : ciudadesQueLaComponen){
            sumaHabitantes = sumaHabitantes + x.poblacionCiudad();
        }
        return sumaHabitantes;
    }

}

