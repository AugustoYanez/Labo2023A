package MascotasAMB;

import Personas.Persona;

public class Pez extends Mascota{


   private static int vidas = 10;

   public Pez(String nombre, Persona dueño) {
      super(nombre, dueño);
   }

   public int getVidas() {
      return vidas;
   }

   public void setVidas(int vidas) {
      this.vidas = vidas;
   }

   public void saludar(Persona dueño, Mascota mascota) {

      boolean esDueño = false;

      if (mascota.getDueño().getNombre().equals(dueño.getNombre())) {
         esDueño = true;
      }

      if ( esDueño == true){
         this.vidas -= 1;
      }
      else
         this.vidas = 0;
      }

      public void alimentar(){

      this.setVidas(this.getVidas()-1);

      }

   }
