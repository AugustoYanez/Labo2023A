package Telefonia;

import Fecha.Fecha;
import Personas.Empleado;

public class Llamada {

    Empleado empleadoOrigen;

    Empleado empleadoDestino;

    Fecha fechaLlamada;

    int duracionLlamada;

    public Llamada() {
        empleadoOrigen = new Empleado();
        empleadoDestino = new Empleado();
        fechaLlamada = new Fecha(1,12,2000);
       duracionLlamada = 5;
    }
    public Llamada(Empleado empleadoOrigen, Empleado empleadoDestino, Fecha fechaLlamada, int duracionLlamada) {
        this.empleadoOrigen = empleadoOrigen;
        this.empleadoDestino = empleadoDestino;
        this.fechaLlamada = fechaLlamada;
        this.duracionLlamada = duracionLlamada;
    }

    public Empleado getEmpleadoOrigen() {
        return empleadoOrigen;
    }

    public void setEmpleadoOrigen(Empleado empleadoOrigen) {
        this.empleadoOrigen = empleadoOrigen;
    }

    public Empleado getEmpleadoDestino() {
        return empleadoDestino;
    }

    public void setEmpleadoDestino(Empleado empleadoDestino) {
        this.empleadoDestino = empleadoDestino;
    }

    public Fecha getFechaLlamada() {
        return fechaLlamada;
    }

    public void setFechaLlamada(Fecha fechaLlamada) {
        this.fechaLlamada = fechaLlamada;
    }

    public int getDuracionLlamada() {
        return duracionLlamada;
    }

    public void setDuracionLlamada(int duracionLlamada) {
        this.duracionLlamada = duracionLlamada;
    }
}
