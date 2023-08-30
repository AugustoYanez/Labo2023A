package Personas;

import Personas.Familiar;

import java.util.ArrayList;
import java.util.HashSet;

public class Familia {

    HashSet<Familiar> familia;

    public Familia(HashSet<Familiar> familia){
        familia = new HashSet<>();
    }
    public HashSet<Familiar> getFamilia() {
        return familia;
    }

    public void setFamilia(HashSet<Familiar> familia) {
        this.familia = familia;
    }

    public double promedioKcalsFamilia(){
        int contador = 0;
        double sumaglobal = 0;
            for ( Familiar x : familia){
                sumaglobal = sumaglobal +  x.kcalsConsumidadEnTotal();
                contador++;
}
        return sumaglobal / contador;
    }

    public double masKcals(){

        double masKcalss = 0;
Familiar mas = new Familiar();
       for ( Familiar i : familia){

           if ( i.kcalsConsumidadEnTotal() > masKcalss){
               masKcalss = i.kcalsConsumidadEnTotal();
               mas = i;
           }
       }

        System.out.println("NOMBRE: " + mas.nombre);
        return masKcalss;



    }

    public double menosKcals(){

        double menosKcalss = 9999999;
        Familiar men = new Familiar();
        for ( Familiar i : familia){

            if ( i.kcalsConsumidadEnTotal() < menosKcalss){
                menosKcalss = i.kcalsConsumidadEnTotal();
                men = i;
            }
        }

        System.out.println("NOMBRE: " + men.nombre);
        return menosKcalss;



    }

}