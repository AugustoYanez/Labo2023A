package SistemaIntercambio;

public class Remera extends Ropa {

    private int medidaEspalda;
    private int medidaContorno;
    private int medidaTorso;

    public int getMedidaEspalda() {
        return medidaEspalda;
    }

    public void setMedidaEspalda(int medidaEspalda) {
        this.medidaEspalda = medidaEspalda;
    }

    public int getMedidaContorno() {
        return medidaContorno;
    }

    public void setMedidaContorno(int medidaContorno) {
        this.medidaContorno = medidaContorno;
    }

    public int getMedidaTorso() {
        return medidaTorso;
    }

    public void setMedidaTorso(int medidaTorso) {
        this.medidaTorso = medidaTorso;
    }

    public Remera(Color color, Material material, String marca, Boolean estado, int medidaEspalda, int medidaContorno, int medidaTorso) {
        super(color, material, marca, estado);
        this.medidaEspalda = medidaEspalda;
        this.medidaContorno = medidaContorno;
        this.medidaTorso = medidaTorso;
    }

    @Override
    public String toString() {
        return super.toString() +"Remera{" +
                "medidaEspalda=" + medidaEspalda +
                ", medidaContorno=" + medidaContorno +
                ", medidaTorso=" + medidaTorso +
                '}';
    }
}
