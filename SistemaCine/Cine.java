package SistemaCine;

import java.time.LocalDate;
import java.util.HashSet;

public class Cine {

    HashSet<Funcion>funciones;

    HashSet<Espectador>espectadores;

    public HashSet<Funcion> getFunciones() {
        return funciones;
    }

    public void setFunciones(HashSet<Funcion> funciones) {
        this.funciones = funciones;
    }

    public HashSet<Espectador> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(HashSet<Espectador> espectadores) {
        this.espectadores = espectadores;
    }

    public Cine(HashSet<Funcion> funciones, HashSet<Espectador> espectadores) {
        this.funciones = funciones;
        this.espectadores = espectadores;
    }
    public void agregarFuncion(Pelicula pelicula, LocalDate fechaHora, SalaCine sala, int cantEspectadores){
        Funcion nuevaFuncion = new Funcion(pelicula, fechaHora, sala, cantEspectadores);
        funciones.add(nuevaFuncion);
    }

    public boolean funcionDisponible(){

        for ( Funcion funcion : funciones){
           if (funcion.getCantEspectadores() < SalaCine.getCantButacas() ) {
return  true;
           }
        }
        return  false;
    }

    public Pelicula peliculaMasVista(){

        for ( Espectador espectador : espectadores){

          espectador.getHistorialFunciones()


        }


    }


}
