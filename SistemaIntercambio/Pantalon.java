package SistemaIntercambio;

public class Pantalon extends Ropa {

    private int medidaCadera;
    private int medidaCintura;
    private int medidaLargo;

    public int getMedidaCadera() {
        return medidaCadera;
    }

    public void setMedidaCadera(int medidaCadera) {
        this.medidaCadera = medidaCadera;
    }

    public int getMedidaCintura() {
        return medidaCintura;
    }

    public void setMedidaCintura(int medidaCintura) {
        this.medidaCintura = medidaCintura;
    }

    public int getMedidaLargo() {
        return medidaLargo;
    }

    public void setMedidaLargo(int medidaLargo) {
        this.medidaLargo = medidaLargo;
    }

    public Pantalon(Color color, Material material, String marca, Boolean estado, int medidaCadera, int medidaCintura, int medidaLargo) {
        super(color, material, marca, estado);
        this.medidaCadera = medidaCadera;
        this.medidaCintura = medidaCintura;
        this.medidaLargo = medidaLargo;
    }



    @Override
    public String toString() {
        return "Pantalon{" +
                "medidaCadera=" + medidaCadera +
                ", medidaCintura=" + medidaCintura +
                ", medidaLargo=" + medidaLargo +
                '}';
    }
}
