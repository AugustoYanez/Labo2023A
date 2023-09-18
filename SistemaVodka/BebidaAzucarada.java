package SistemaVodka;

public class BebidaAzucarada extends Bebida {

    private int cantAzucar;

    public BebidaAzucarada(String nombre, int coefPositividad, int coefNegatividad, int cantAzucar) {
        super(nombre, coefPositividad, coefNegatividad);
        this.cantAzucar = cantAzucar;
    }

    public int getCantAzucar() {
        return cantAzucar;
    }

    public void setCantAzucar(int cantAzucar) {
        this.cantAzucar = cantAzucar;
    }



}
