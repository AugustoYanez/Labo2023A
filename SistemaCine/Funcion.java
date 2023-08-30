package SistemaCine;

import java.time.LocalDate;
import java.util.Date;

public class Funcion  {

    private  Pelicula pelicula;

    private LocalDate fechaHora;

    private SalaCine sala;

    private int cantEspectadores;

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public LocalDate getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDate fechaHora) {
        this.fechaHora = fechaHora;
    }

    public SalaCine getSala() {
        return sala;
    }

    public void setSala(SalaCine sala) {
        this.sala = sala;
    }

    public int getCantEspectadores() {
        return cantEspectadores;
    }

    public void setCantEspectadores(int cantEspectadores) {
        this.cantEspectadores = cantEspectadores;
    }

    public Funcion(){
        this.cantEspectadores = 0;
    }
    public Funcion(Pelicula pelicula, LocalDate fechaHora, SalaCine sala, int cantEspectadores) {
        this.pelicula = pelicula;
        this.fechaHora = fechaHora;
        this.sala = sala;
        this.cantEspectadores = cantEspectadores;
    }
}
