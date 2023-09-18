package SistemaVodka;

public class BebidaAlcoholica extends Bebida{


    private int cantAlcohol;


    public BebidaAlcoholica(String nombre, int coefPositividad, int coefNegatividad, int cantAlcohol) {
        super(nombre, coefPositividad, coefNegatividad);
        this.cantAlcohol = cantAlcohol;
    }

    public int getCantAlcohol() {
        return cantAlcohol;
    }

    public void setCantAlcohol(int cantAlcohol) {
        this.cantAlcohol = cantAlcohol;
    }
}
