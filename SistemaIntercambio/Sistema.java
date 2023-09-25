package SistemaIntercambio;

import java.util.HashSet;

public class Sistema  {

    HashSet<Prestable> circuitoDePrestamos;


    public Sistema(HashSet<Prestable> circuitoDePrestamos) {
        this.circuitoDePrestamos = circuitoDePrestamos;
    }

    public HashSet<Prestable> getCircuitoDePrestamos() {
        return circuitoDePrestamos;
    }

    public void setCircuitoDePrestamos(HashSet<Prestable> circuitoDePrestamos) {
        this.circuitoDePrestamos = circuitoDePrestamos;
    }

    public void addElemento(Prestable p){
        if ( p.agregarElemento() ){
            circuitoDePrestamos.add(p);
            System.out.println("Agregado correctamente. ");
        }
        else {
            System.out.println("No se pudo agregar. ");
        }
    }

}
