package A.F.A;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;

public class Defensa extends Jugador implements Contrato {

    private double porcentajeGoles;
    private int asistencias;

    public Defensa(String nombre, String apellido, LocalDate fechaNacimiento, int dni, Posicion posicion, Provincia provincia, HashSet<Equipo> historialDeEquipos, Equipo equipoActual, int numeroCamiseta, double porcentajeGoles, int asistencias) {
        super(nombre, apellido, fechaNacimiento, dni, posicion, provincia, historialDeEquipos, numeroCamiseta, equipoActual);
        this.porcentajeGoles = porcentajeGoles;
        this.asistencias = asistencias;
    }

    public double getPorcentajeGoles() {
        return porcentajeGoles;
    }

    public void setPorcentajeGoles(double porcentajeGoles) {
        this.porcentajeGoles = porcentajeGoles;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    @Override
    public String toString() {
        return "Defensa{" +
                "porcentajeGoles=" + porcentajeGoles +
                ", asistencias=" + asistencias +
                '}';
    }

    @Override
    public boolean contratar(Equipo equipo) {
        try {
            if ((this.getHistorialDeEquipos().contains(equipo) == false) && (this.getPorcentajeGoles() > 30) && (this.getAsistencias() > 10)) {

                System.out.println(this.getNombre() + this.getApellido() + toString() + " Se contrato con " + getEquipoActual());
                return true;
            } else {
                throw new NoSePudoContratar("El jugador no cumple con algun requisito. ");
            }
        } catch (NoSePudoContratar e) {
            System.out.println(e.getMessage());
            return false;
        }

    }

    @Override
    public boolean renovar( Equipo equipoRenovar) {

        try {
            if ( this.getEquipoActual().equals( equipoRenovar) && (LocalDate.now().getYear() - LocalDate.of(2023,10,10).getYear()) < 35){
                System.out.println(getNombre() + toString() + " Se renovo con " + getEquipoActual() );
                return true;
            }
            else {
                throw new NoSePudoRenovar("No cumple requisitos. ");
            }
        }
        catch (NoSePudoRenovar e){
            e.getMessage();
            return false;
        }
    }

}
