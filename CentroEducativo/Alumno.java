package CentroEducativo;

import java.util.HashSet;

public class Alumno {
    private int dni;
    private String apeliido;
    private String nombre;
    private HashSet<Examen> examenes;

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApeliido() {
        return apeliido;
    }

    public void setApeliido(String apeliido) {
        this.apeliido = apeliido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Examen> getExamenes() {
        return examenes;
    }

    public void setExamenes(HashSet<Examen> examenes) {
        this.examenes = examenes;
    }

    public Alumno(int dni, String apeliido, String nombre, HashSet<Examen> examenes) {
        this.dni = dni;
        this.apeliido = apeliido;
        this.nombre = nombre;
        this.examenes = examenes;
    }

    public boolean aprobar() {

        boolean retorno = true;
        for (Examen i : examenes) {

            if (i.verAprobacion() == true) {
                retorno = true;
            } else {
                retorno = false;
            }

        }
        return retorno;

    }
}


