package CentroEducativo;

import java.time.LocalDateTime;

public class ExamenEscrito extends Examen {

    private int duracion;
    private int notaNumerica;
    public ExamenEscrito(LocalDateTime fecha, int duracion, int notaNumerica) {
        super(fecha);
        this.duracion = duracion;
        this.notaNumerica = notaNumerica;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getNotaNumerica() {
        return notaNumerica;
    }

    public void setNotaNumerica(int notaNumerica) {
        this.notaNumerica = notaNumerica;
    }


    @Override
    public boolean verAprobacion() {

        if ( notaNumerica > 6 && duracion < 90) {
            return true;
        }
        else {
            return false;
        }

    }
}