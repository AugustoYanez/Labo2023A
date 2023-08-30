package MascotasAMB;

import Personas.Persona;

public class Gato extends Mascota {

    private int alegria = 1;

    public int getAlegria() {
        return alegria;
    }

    public void setAlegria(int alegria) {
        this.alegria = alegria;
    }

    public Gato(String nombre, Persona dueño, int alegria) {
        super(nombre, dueño);
        this.alegria = alegria;
    }

    @Override
    public void saludar(Persona dueño, Mascota mascota) {
boolean esDueño = false;
String saludoNormal = "Miau";
String saludoEnojado = "Miau!";

        if (mascota.getDueño().getNombre().equals(dueño.getNombre())) {
            esDueño = true;
        }

        if ( esDueño == true){

            for ( int i = 0; i < this.getAlegria(); i++){
                System.out.println(saludoNormal + " ");
            }
            if ( this.alegria > 1){
                this.alegria -= 1;
            }
        }
        else {

            for ( int i = 0; i < this.getAlegria(); i++){
                System.out.println(saludoEnojado + " ");
            }

            if ( this.alegria > 1){
                this.alegria -= 1;
            }
        }

    }
    public void alimentar(){

this.alegria += 1;

    }


}
