package SistemaCine;

import java.time.LocalDate;
import java.util.HashSet;

public class Cine {

    HashSet<Funcion> funciones;

    HashSet<Espectador> espectadores;

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

    public void agregarFuncion(Pelicula pelicula, LocalDate fechaHora, SalaCine sala, int cantEspectadores) {
        Funcion nuevaFuncion = new Funcion(pelicula, fechaHora, sala, cantEspectadores);
        funciones.add(nuevaFuncion);
    }

    public boolean funcionDisponible() {

        for (Funcion funcion : funciones) {
            if (funcion.getCantEspectadores() < SalaCine.getCantButacas()) {
                return true;
            }
        }
        return false;
    }

    public Pelicula peliculaMasVista() {

        Funcion funcionMasVista = new Funcion();
        Pelicula peliculaMasVista = new Pelicula();

        for (Funcion funcion : funciones) {
            if (funcion.getCantEspectadores() > funcionMasVista.getCantEspectadores()) {
                funcionMasVista = funcion;
                peliculaMasVista = funcionMasVista.getPelicula();
            }
        }
        return peliculaMasVista;
    }


    public Espectador usuariosMenosEntrada(){

        Espectador menosVecesCompro = new Espectador();
        Boolean primeraVuelta = true;

        for ( Espectador espectador : espectadores){

            if ( primeraVuelta == true || espectador.getHistorialFunciones().size() < menosVecesCompro.getHistorialFunciones().size() ){
                primeraVuelta = false;
                menosVecesCompro = espectador;
            }
        }
return menosVecesCompro;
    }


}
