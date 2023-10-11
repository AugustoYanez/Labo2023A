package A.F.A;

import java.time.LocalDate;
import java.util.HashMap;

public class Partido {

    private Equipo equipo1;
    private Equipo equipo2;

    private LocalDate fechaPartido;
    private HashMap<Jugador,Integer> golesDelPartido;

    private HashMap<Jugador, Integer> atajadasDelPartido;
    private HashMap<Jugador,Integer> asistenciasDelPartido;

    public Partido(Equipo equipo1, Equipo equipo2, LocalDate fechaPartido, HashMap<Jugador, Integer> golesDelPartido, HashMap<Jugador, Integer> atajadasDelPartido, HashMap<Jugador, Integer> asistenciasDelPartido) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.fechaPartido = fechaPartido;
        this.golesDelPartido = golesDelPartido;
        this.atajadasDelPartido = atajadasDelPartido;
        this.asistenciasDelPartido = asistenciasDelPartido;
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }

    public LocalDate getFechaPartido() {
        return fechaPartido;
    }

    public void setFechaPartido(LocalDate fechaPartido) {
        this.fechaPartido = fechaPartido;
    }

    public HashMap<Jugador, Integer> getGolesDelPartido() {
        return golesDelPartido;
    }

    public void setGolesDelPartido(HashMap<Jugador, Integer> golesDelPartido) {
        this.golesDelPartido = golesDelPartido;
    }

    public HashMap<Jugador, Integer> getAtajadasDelPartido() {
        return atajadasDelPartido;
    }

    public void setAtajadasDelPartido(HashMap<Jugador, Integer> atajadasDelPartido) {
        this.atajadasDelPartido = atajadasDelPartido;
    }

    public HashMap<Jugador, Integer> getAsistenciasDelPartido() {
        return asistenciasDelPartido;
    }

    public void setAsistenciasDelPartido(HashMap<Jugador, Integer> asistenciasDelPartido) {
        this.asistenciasDelPartido = asistenciasDelPartido;
    }
}
