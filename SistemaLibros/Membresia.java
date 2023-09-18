package SistemaLibros;

public enum Membresia {
    ORO(50), BRONCE(5), PLATA(15);

    private int cantidad;

    private Membresia(int cantidad){
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
