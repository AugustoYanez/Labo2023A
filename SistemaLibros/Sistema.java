package SistemaLibros;

import SistemaLibros.Exc.LimiteDePrestamosAlcanzadoException;
import SistemaLibros.Exc.MembresiaExc;

import java.util.HashSet;

public class Sistema {

HashSet<Libro> biblioteca;

    public Sistema(HashSet<Libro> biblioteca) {
        this.biblioteca = biblioteca;
    }

    public HashSet<Libro> getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(HashSet<Libro> biblioteca) {
        this.biblioteca = biblioteca;
    }

    public void agregarLibro(Libro libro){

        biblioteca.add(libro);

    }

    public void borrarLibro(Libro libro){

        biblioteca.remove(libro);

    }

    public void modificarLibro(Libro libroAModificar, String titulo, Autor autor, GeneroLibro generoLibro, String nombreArchivoPDF){

        for (Libro l: biblioteca){
            if ( l.equals(libroAModificar)){
                l.setTitulo(titulo);
                l.setAutor(autor);
                l.setGeneroLibro(generoLibro);
                l.setNombreArchivoPDF(nombreArchivoPDF);
            }
        }
    }

public void gestionarPrestamo(Usuario user, Libro libro) throws MembresiaExc, LimiteDePrestamosAlcanzadoException {

if ( user.getLibrosPrestados().size() > user.getTipoMembresia().getCantidad() || libro.getCantidadDescargasActuales()+1 >= libro.getCantidadDescargas()) {
    throw new MembresiaExc("A alcanzado el maximo de libros prestados, り乇√ひ乇ﾚ√ﾑﾑﾑﾑﾑ!!. DEVUELVAAAAA!!. ◤✞ ∂єνυєℓνααααα!!. ✞◥ ");
   // throw new LimiteDePrestamosAlcanzadoException("El libro tiene la cantidad maxima. ◤✞ єℓιנα σтяσσ ✞◥ ");
}else {
    user.getLibrosPrestados().add(libro);
}
}



}
