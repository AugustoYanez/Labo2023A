package SistemaCine;

import java.util.HashSet;

public class SalaCine {

    private int numero;

    private static int cantButacas = 45;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public static int getCantButacas() {
        return cantButacas;
    }

    public static void setCantButacas(int cantButacas) {
        SalaCine.cantButacas = cantButacas;
    }

    public SalaCine(int numero) {
        this.numero = numero;
    }
}




