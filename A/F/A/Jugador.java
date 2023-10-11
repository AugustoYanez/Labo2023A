package A.F.A;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;

public abstract class Jugador extends Persona implements Contrato {

private Posicion posicion;

private Provincia provincia;

private HashSet<Equipo> historialDeEquipos;

private int numeroCamiseta;

private Equipo equipoActual;

    public Jugador(String nombre, String apellido, LocalDate fechaNacimiento, int dni, Posicion posicion, Provincia provincia, HashSet<Equipo> historialDeEquipos, int numeroCamiseta, Equipo equipoActual) {
        super(nombre, apellido, fechaNacimiento, dni);
        this.posicion = posicion;
        this.provincia = provincia;
        this.historialDeEquipos = historialDeEquipos;
        this.numeroCamiseta = numeroCamiseta;
        this.equipoActual = equipoActual;
    }

    public Equipo getEquipoActual() {
        return equipoActual;
    }

    public void setEquipoActual(Equipo equipoActual) {
        this.equipoActual = equipoActual;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public HashSet<Equipo> getHistorialDeEquipos() {
        return historialDeEquipos;
    }

    public void setHistorialDeEquipos(HashSet<Equipo> historialDeEquipos) {
        this.historialDeEquipos = historialDeEquipos;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "posicion=" + posicion +
                ", provincia=" + provincia +
                ", historialDeEquipos=" + historialDeEquipos +
                ", numeroCamiseta=" + numeroCamiseta +
                '}';
    }



}
