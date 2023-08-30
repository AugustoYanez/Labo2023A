package Lugares;

import java.util.HashSet;

public abstract class Mundo {

    HashSet<Lugar> lugares;

    public Mundo(HashSet<Lugar> lugares) {
        this.lugares = lugares;
    }

    public HashSet<Lugar> getLugares() {
        return lugares;
    }

    public void setLugares(HashSet<Lugar> lugares) {
        this.lugares = lugares;
    }


    public void aggLugar(Lugar lugarZ){

        lugares.add(lugarZ);


    }


    public void delLugar(Lugar lugarAEliminar){

        for ( Lugar x : lugares){

            if ( x.getCodigo() == lugarAEliminar.getCodigo()){
                lugares.remove(x);
            }

        }
    }


    public void modificarLugar(Lugar LlugarAModificar){






    }



    public void poblacionXcodigo(Lugar lugarConsulta){

        for ( Lugar x : lugares){

            if ( x instanceof Barrio){
            if ( x.getCodigo() == lugarConsulta.getCodigo()){

                System.out.println("POBLACION: " + ((Barrio) x).getPoblacion());

            }
            }
            else {
                System.out.println("no se encontro");
            }

        }

    }

    public void pantalla(){

        for ( Lugar x : lugares){

            if ( x instanceof Pais){

            }


        }








    }




}
