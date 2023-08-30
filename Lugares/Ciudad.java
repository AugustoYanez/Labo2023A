package Lugares;

import java.util.ArrayList;
import java.util.HashSet;

public class Ciudad extends Lugar {

    HashSet<Barrio> barriosQueComponen;


    public Ciudad(String nombre, int codigo, ArrayList<Coordenadas> cordenadas, HashSet<Barrio> barriosQueComponen) {
        super(nombre, codigo, cordenadas);
        this.barriosQueComponen = barriosQueComponen;
    }

    public HashSet<Barrio> getBarriosQueComponen() {
        return barriosQueComponen;
    }

    public void setBarriosQueComponen(HashSet<Barrio> barriosQueComponen) {
        this.barriosQueComponen = barriosQueComponen;
    }


    public int poblacionCiudad(){
   int sumaHabitantes = 0;
        for( Barrio x : barriosQueComponen){
            sumaHabitantes = sumaHabitantes + x.getPoblacion();
        }
return sumaHabitantes;
    }
}
