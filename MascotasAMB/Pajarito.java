package MascotasAMB;

import Personas.Persona;

public class Pajarito extends Mascota{

    private int alegria = 1;

    public int getAlegria() {
        return alegria;
    }

    public void setAlegria(int alegria) {
        this.alegria = alegria;
    }

    private Boolean esCantor;
    public Pajarito(String nombre, Persona dueño, Boolean esCantor, int alegria) {
        super(nombre, dueño);
        this.esCantor = esCantor;
        this.alegria = alegria;
    }

    public Boolean getEsCantor() {
        return esCantor;
    }

    public void setEsCantor(Boolean esCantor) {
        this.esCantor = esCantor;
    }

    @Override
    public void saludar(Persona dueño, Mascota mascota) {
        boolean esDueño = false;
        String saludoNormal = "pio";
        String saludoCantor = "yeahBuddy!";

        if (mascota.getDueño().getNombre().equals(dueño.getNombre())) {
            esDueño = true;
        }

        if ( esDueño == true){

            if (esCantor == true){

            for ( int i = 0; i < this.getAlegria(); i++){
                System.out.println(saludoCantor + " ");
            }
            if ( this.alegria > 1){
                this.alegria -= 1;
            }
        }
        else {
            for ( int i = 0; i < this.getAlegria(); i++){
                System.out.println(saludoNormal + " ");
            }
            if ( this.alegria > 1){
                this.alegria -= 1;
            }
        }
        }

    }
    public void alimentar(){

        this.alegria += 1;

    }
}
