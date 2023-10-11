package A.F.A;

import java.util.HashSet;

public class Equipo   {

    private String nombreEquipo;

    private HashSet<Jugador> listaDeJUgadores;

    public Equipo(String nombreEquipo, HashSet<Jugador> listaDeJUgadores) {
        this.nombreEquipo = nombreEquipo;
        this.listaDeJUgadores = listaDeJUgadores;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public HashSet<Jugador> getListaDeJUgadores() {
        return listaDeJUgadores;
    }

    public void setListaDeJUgadores(HashSet<Jugador> listaDeJUgadores) {
        this.listaDeJUgadores = listaDeJUgadores;
    }



}
