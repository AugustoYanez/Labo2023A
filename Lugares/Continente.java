package Lugares;

import java.util.ArrayList;
import java.util.HashSet;

public class Continente extends Lugar {

    HashSet<Pais> paisesQueLoComponen;


    public HashSet<Pais> getPaisesQueLoComponen() {
        return paisesQueLoComponen;
    }

    public void setPaisesQueLoComponen(HashSet<Pais> paisesQueLoComponen) {
        this.paisesQueLoComponen = paisesQueLoComponen;
    }

    public Continente(String nombre, int codigo, ArrayList<Coordenadas> cordenadas, HashSet<Pais> paisesQueLoComponen) {
        super(nombre, codigo, cordenadas);
        this.paisesQueLoComponen = paisesQueLoComponen;

    }

    public int poblacionContinene(){

        int sumaHabitantes = 0;

        for ( Pais x : paisesQueLoComponen){
            sumaHabitantes = sumaHabitantes + x.poblacionEnPais();
        }
        return sumaHabitantes;
    }
}
