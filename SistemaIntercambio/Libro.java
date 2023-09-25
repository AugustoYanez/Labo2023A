package SistemaIntercambio;

import java.util.HashMap;

public class Libro extends ObjetoLectura implements Prestable{

   private HashMap<Integer,Integer> paginasXcapitulo; // capitulo - pagina 1 - 90

   public Libro(int codigo, String titulo, int añoPublicacion, HashMap<Integer, Integer> paginasXcapitulo) {
      super(codigo, titulo, añoPublicacion);
      this.paginasXcapitulo = paginasXcapitulo;
   }

   public HashMap<Integer, Integer> getPaginasXcapitulo() {
      return paginasXcapitulo;
   }

   public void setPaginasXcapitulo(HashMap<Integer, Integer> paginasXcapitulo) {
      this.paginasXcapitulo = paginasXcapitulo;
   }

   @Override
   public String toString() {
      return "Libro{" +
              "paginasXcapitulo=" + paginasXcapitulo +
              '}';
   }

   @Override
   public boolean prestar(){

      if ( this.paginasXcapitulo.size() %2==1 ){
         System.out.println("El libro se dara prestado." );
         return true;
      }
      else {
         return false;
      }
   }
   public boolean agregarElemento(){

if ( prestar() ) {

   return true;
}
else {
   return false;
}

   }
}
