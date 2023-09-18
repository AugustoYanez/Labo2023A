package SistemaVodka;

public class Bebida {

    private String nombre;

    private int coefPositividad;
    private int coefNegatividad;

    public Bebida(String nombre, int coefPositividad, int coefNegatividad) {
        this.nombre = nombre;
        this.coefPositividad = coefPositividad;
        this.coefNegatividad = coefNegatividad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCoefPositividad() {
        return coefPositividad;
    }

    public void setCoefPositividad(int coefPositividad) {
        this.coefPositividad = coefPositividad;
    }

    public int getCoefNegatividad() {
        return coefNegatividad;
    }

    public void setCoefNegatividad(int coefNegatividad) {
        this.coefNegatividad = coefNegatividad;
    }
}
