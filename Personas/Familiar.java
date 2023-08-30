package Personas;

import Objetos.Plato;

import java.util.ArrayList;
import java.util.HashMap;

public class Familiar extends Persona {

    ArrayList<Plato> platosconsumidos;
public Familiar(){
    super();
    platosconsumidos = new ArrayList<>();
}
    public ArrayList<Plato> getPlatosconsumidos() {
        return platosconsumidos;
    }

    public void setPlatosconsumidos(ArrayList<Plato> platosconsumidos) {
        this.platosconsumidos = platosconsumidos;
    }

    public double kcalsConsumidadEnTotal(){
    double sumaglobal = 0;
for ( Plato i : platosconsumidos){
        sumaglobal = sumaglobal + i.getCalorias();
}
        return  sumaglobal / platosconsumidos.size();
    }
}
