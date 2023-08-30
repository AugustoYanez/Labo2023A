package Componentes;

public abstract  class Componente {

    int idComponente;

    String nombreComponente;
String nombreFabricante;

String modelo;

int precioVenta;

int stock;

public Componente(){
    this.idComponente = 1;
    this.nombreComponente = "";
    this.nombreFabricante = "";
    this.modelo = "";
    this.precioVenta = 1000;
    this.stock = 100;
}
    public Componente(int idComponente, String nombreComponente, String nombreFabricante, String modelo, int precioVenta, int stock) {
        this.idComponente = idComponente;
        this.nombreComponente = nombreComponente;
        this.nombreFabricante = nombreFabricante;
        this.modelo = modelo;
        this.precioVenta = precioVenta;
        this.stock = stock;
    }

    public int getIdComponente() {
        return idComponente;
    }

    public void setIdComponente(int idComponente) {
        this.idComponente = idComponente;
    }

    public String getNombreComponente() {
        return nombreComponente;
    }

    public void setNombreComponente(String nombreComponente) {
        this.nombreComponente = nombreComponente;
    }

    public String getNombreFabricante() {
        return nombreFabricante;
    }

    public void setNombreFabricante(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}