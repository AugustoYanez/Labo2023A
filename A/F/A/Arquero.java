package A.F.A;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;

public class Arquero extends Jugador implements Contrato {

private double porcentajeAtajadas;
private int golesRecibidos;

    public Arquero(String nombre, String apellido, LocalDate fechaNacimiento, int dni, Posicion posicion, Provincia provincia, HashSet<Equipo> historialDeEquipos,Equipo equipoActual, int numeroCamiseta, double porcentajeAtajadas, int golesRecibidos) {
        super(nombre, apellido, fechaNacimiento, dni, posicion, provincia, historialDeEquipos, numeroCamiseta, equipoActual);
        this.porcentajeAtajadas = porcentajeAtajadas;
        this.golesRecibidos = golesRecibidos;
    }

    public double getPorcentajeAtajadas() {
        return porcentajeAtajadas;
    }

    public void setPorcentajeAtajadas(double porcentajeAtajadas) {
        this.porcentajeAtajadas = porcentajeAtajadas;
    }

    public int getGolesRecibidos() {
        return golesRecibidos;
    }

    public void setGolesRecibidos(int golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }

    @Override
    public String toString() {
        return "Arquero{" +
                "porcentajeAtajadas=" + porcentajeAtajadas +
                ", golesRecibidos=" + golesRecibidos +
                '}';
    }
    public boolean contratar(Equipo equipo) {
        try {
            if ((this.getHistorialDeEquipos().contains(equipo) == false) && (this.getPorcentajeAtajadas() > 60) && (this.getGolesRecibidos() < 10)) {

                System.out.println(this.getNombre() + this.getApellido() + toString() + " Se contrato con " + getEquipoActual());
                return true;
            } else {
                throw new NoSePudoContratar("El arquero no cumple con algun requisito. ");
            }
        } catch (NoSePudoContratar e) {
            System.out.println(e.getMessage());
            return false;
        }

    }



    @Override
public boolean renovar( Equipo equipoRenovar) {

        try {
            if ( this.getEquipoActual().equals(equipoRenovar) && ( LocalDate.now().getYear()  - this.getFechaNacimiento().getYear() ) < 35){
                System.out.println(getNombre() + toString() + " Se renovo con " + getEquipoActual() );
                return true;
            }
            else {
                throw new NoSePudoRenovar("No cumple requisitos. ");
            }
        }
     catch (NoSePudoRenovar e){
         System.out.println( e.getMessage());
         return false;
     }
}
}
