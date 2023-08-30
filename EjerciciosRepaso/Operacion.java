package EjerciciosRepaso;

public class Operacion {

    private int n1;
    private int n2;

    public Operacion(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }


    public static int sumar( int n1, int n2){
        int sumar = n1 + n2;
        return sumar;
    }

    public static int restar( int n1, int n2){
        int restar = n1 - n2;
        return restar;
    }

}
