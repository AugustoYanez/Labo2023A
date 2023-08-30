package MascotasAMB;

import Personas.Persona;

import java.util.HashSet;
import java.util.Vector;

public class Centro_adopcion {

    private HashSet<Mascota> listaDeMascotas;


    public Centro_adopcion(HashSet<Mascota> listaDeMascotas) {
        this.listaDeMascotas = listaDeMascotas;
    }

    public HashSet<Mascota> getListaDeMascotas() {
        return listaDeMascotas;
    }

    public void setListaDeMascotas(HashSet<Mascota> listaDeMascotas) {
        this.listaDeMascotas = listaDeMascotas;
    }

    public void agregarMascota(Mascota mascota){ // recibe dueño y nombre y con la instancia que tipo
        listaDeMascotas.add(mascota);
    }
    public void modificarMascota(Persona dueño, String nuevoNombre){

        for ( Mascota mascota : listaDeMascotas){

            if ( mascota.getDueño().getNombre().equals(dueño.getNombre()) ){
                mascota.setNombre(nuevoNombre);
            }
            System.out.println("Nombre modificado a : " + nuevoNombre + " Correctamente. ");
        }
    }

    public void eliminarMascota(Persona dueño){

        for ( Mascota mascota : listaDeMascotas){

            if ( mascota.getDueño().getNombre().equals(dueño.getNombre()) ){
                listaDeMascotas.remove(mascota);
            }
            System.out.println("Mascota de " + dueño.getNombre() + " eliminada del centro. ");
        }

        // eliminar peces sin vida


        for ( Mascota mascota : listaDeMascotas) {

            if (mascota instanceof Pez) {
                if (((Pez) mascota).getVidas() == 0) {
                    listaDeMascotas.remove(mascota);
                }
            }
        }
    }



public void saludar(Persona dueño, Mascota mascota){

   mascota.saludar(dueño,mascota);

}

}
