package CentroEducativo;

import java.time.LocalDateTime;

    public abstract class Examen implements Aprobacion {
    private LocalDateTime fecha;

        public LocalDateTime getFecha() {
            return fecha;
        }

        public void setFecha(LocalDateTime fecha) {
            this.fecha = fecha;
        }

        public Examen(LocalDateTime fecha) {
            this.fecha = fecha;
        }


    }
