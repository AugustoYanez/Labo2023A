package Telefonia;

import Cancion.Cancion;

import java.util.ArrayList;

public class Sistema {

    ArrayList<Llamada> llamadasRealizadas;

    public ArrayList<Llamada> getLlamadasRealizadas() {
        return llamadasRealizadas;
    }

    public void setLlamadasRealizadas(ArrayList<Llamada> llamadasRealizadas) {
        this.llamadasRealizadas = llamadasRealizadas;
    }

    public Sistema() {
        this.llamadasRealizadas = new ArrayList<Llamada>();
    }
    public Sistema(ArrayList<Llamada> llamadasRealizadas) {
        this.llamadasRealizadas = llamadasRealizadas;
    }
}
