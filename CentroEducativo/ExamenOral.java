package CentroEducativo;

import java.time.LocalDateTime;

public class ExamenOral extends Examen {

    private NivelSatisfaccion nivelSatisfaccion;

    public ExamenOral(LocalDateTime fecha, NivelSatisfaccion nivelSatisfaccion) {
        super(fecha);
        this.nivelSatisfaccion = nivelSatisfaccion;
    }

    public NivelSatisfaccion getNivelSatisfaccion() {
        return nivelSatisfaccion;
    }

    public void setNivelSatisfaccion(NivelSatisfaccion nivelSatisfaccion) {
        this.nivelSatisfaccion = nivelSatisfaccion;
    }

    @Override
    public boolean verAprobacion() {

        if (nivelSatisfaccion.equals(NivelSatisfaccion.SUFICIENTE) || nivelSatisfaccion.equals(nivelSatisfaccion.EXCELENTE)) {
            return true;
        } else {
            return false;
        }
    }
}