package SistemaIntercambio;

import java.time.LocalDate;
import java.util.Locale;

public class Revista extends ObjetoLectura implements Prestable {

    private LocalDate fechaPublicacion;

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public Revista(int codigo, String titulo, int añoPublicacion, LocalDate fechaPublicacion) {
        super(codigo, titulo, añoPublicacion);
        this.fechaPublicacion = fechaPublicacion;
    }

    @Override
    public String toString() {
        return super.toString() + "Revista{" +
                "fechaPublicacion=" + fechaPublicacion +
                '}';
    }

    @Override
    public boolean prestar(){

       if ( this.fechaPublicacion.isBefore(LocalDate.of(2023,06,25))){
           System.out.println("La revista se dara prestada. ");
           return true;
       }
       else {
           System.out.println("La revista NO se dara prestada. ");
           return false;
       }
    }

    @Override

    public boolean agregarElemento(){

if ( prestar() ) {
    return true;
}
else {
    return  false;
}

    }

}
