package Lugares;

import java.util.ArrayList;
import java.util.HashSet;

public class Pais extends Lugar {

    HashSet<Estado> estadosQueLaComponen;

    HashSet<Provincia> provinciasQueLaComponen;


    public Pais(String nombre, int codigo, ArrayList<Coordenadas> cordenadas, HashSet<Estado> estadosQueLaComponen, HashSet<Provincia> provinciasQueLaComponen) {
        super(nombre, codigo, cordenadas);
        this.estadosQueLaComponen = estadosQueLaComponen;
        this.provinciasQueLaComponen = provinciasQueLaComponen;
    }

    public HashSet<Estado> getEstadosQueLaComponen() {
        return estadosQueLaComponen;
    }

    public void setEstadosQueLaComponen(HashSet<Estado> estadosQueLaComponen) {
        this.estadosQueLaComponen = estadosQueLaComponen;
    }

    public HashSet<Provincia> getProvinciasQueLaComponen() {
        return provinciasQueLaComponen;
    }

    public void setProvinciasQueLaComponen(HashSet<Provincia> provinciasQueLaComponen) {
        this.provinciasQueLaComponen = provinciasQueLaComponen;
    }

    public int poblacionEnPais() {

        int sumaHabitantesEstado = 0;
        int sumaHabitantesProvincia = 0;
        int sumatotal = 0;
        for (Provincia x : provinciasQueLaComponen) {
            sumaHabitantesProvincia = sumaHabitantesProvincia + x.poblacioEnProvincia();
        }
        for (Estado x : estadosQueLaComponen) {
            sumaHabitantesEstado = sumaHabitantesEstado + x.poblacioEnEstado();
        }
        sumatotal = sumaHabitantesEstado + sumaHabitantesProvincia;
        return sumatotal;
    }
}
