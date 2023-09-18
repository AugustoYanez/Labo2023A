package SistemaLibros;

import Personas.Persona;

import java.time.LocalDate;
import java.util.HashSet;

public class Usuario extends Persona {

    HashSet<Libro> librosPrestados;
    private Membresia tipoMembresia;


    public Usuario(String nombre, int dni, LocalDate nacimiento, String mail, HashSet<Libro> librosPrestados, Membresia tipoMembresia) {
        super(nombre, dni, nacimiento, mail);
        this.librosPrestados = librosPrestados;
        this.tipoMembresia = tipoMembresia;
    }

    public HashSet<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(HashSet<Libro> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    public Membresia getTipoMembresia() {
        return tipoMembresia;
    }

    public void setTipoMembresia(Membresia tipoMembresia) {
        this.tipoMembresia = tipoMembresia;
    }


}
