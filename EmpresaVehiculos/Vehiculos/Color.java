package EmpresaVehiculos.Vehiculos;

public enum Color {

    ROJO("#FF0000"),
    VERDE("#00FF00"),
    AZUL("#0000FF");
    private String codigoHex;

    private Color (String codigoHex) {
        this.codigoHex = codigoHex;
    }

    public String getCodigoHex() {
        return codigoHex;
    }
}

