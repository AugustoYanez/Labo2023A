package Objetos;


public class Plato {

    String nombre;

    int calorias;

    int precio;

    public Plato(){
        nombre = "Carne";
        precio = 200;
        calorias = 500;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public Plato(String nombre, int precio, int calorias) {
        this.nombre = nombre;
        this.precio = precio;
        this.calorias = calorias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }


}
