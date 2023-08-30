package Lugares;

import java.util.ArrayList;
import java.util.HashSet;

public class Estado extends Lugar  {
    HashSet<Ciudad> ciudadesQueLaComponen;

    public Estado(String nombre, int codigo, ArrayList<Coordenadas> cordenadas, HashSet<Ciudad> ciudadesQueLaComponen) {
        super(nombre, codigo, cordenadas);
        this.ciudadesQueLaComponen = ciudadesQueLaComponen;
    }

    public HashSet<Ciudad> getCiudadesQueLaComponen() {
        return ciudadesQueLaComponen;
    }

    public void setCiudadesQueLaComponen(HashSet<Ciudad> ciudadesQueLaComponen) {
        this.ciudadesQueLaComponen = ciudadesQueLaComponen;
    }

    public int poblacioEnEstado(){
        int sumaHabitantes = 0;
        for( Ciudad x : ciudadesQueLaComponen){
            sumaHabitantes = sumaHabitantes + x.poblacionCiudad();
        }
        return sumaHabitantes;
    }
}
