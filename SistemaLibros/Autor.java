package SistemaLibros;

import Fecha.Fecha;
import Personas.Persona;

import java.time.LocalDate;
import java.util.HashSet;

public class Autor extends Persona {

HashSet<Libro> bibliografia;

    public Autor(String nombre, String apellido, int dni, LocalDate nacimiento, HashSet<Libro> bibliografia) {
        super(nombre, apellido, dni, nacimiento);
        this.bibliografia = bibliografia;
    }
    public HashSet<Libro> getBibliografia() {
        return bibliografia;
    }

    public void setBibliografia(HashSet<Libro> bibliografia) {
        this.bibliografia = bibliografia;
    }
}
