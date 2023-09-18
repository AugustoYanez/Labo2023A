package SistemaLibros;

public class Libro {

private String titulo;

private Autor autor;

private GeneroLibro generoLibro;

private String nombreArchivoPDF;

private static int cantidadDescargas;

private int cantidadDescargasActuales;

    public Libro(String titulo, Autor autor, GeneroLibro generoLibro, String nombreArchivoPDF, int cantidadDescargasActualess) {
        this.titulo = titulo;
        this.autor = autor;
        this.generoLibro = generoLibro;
        this.nombreArchivoPDF = nombreArchivoPDF;
        this.cantidadDescargasActuales = cantidadDescargasActuales;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public GeneroLibro getGeneroLibro() {
        return generoLibro;
    }

    public void setGeneroLibro(GeneroLibro generoLibro) {
        this.generoLibro = generoLibro;
    }

    public String getNombreArchivoPDF() {
        return nombreArchivoPDF;
    }

    public void setNombreArchivoPDF(String nombreArchivoPDF) {
        this.nombreArchivoPDF = nombreArchivoPDF;
    }

    public static int getCantidadDescargas() {
        return cantidadDescargas;
    }

    public static void setCantidadDescargas(int cantidadDescargas) {
        Libro.cantidadDescargas = cantidadDescargas;
    }

    public int getCantidadDescargasActuales() {
        return cantidadDescargasActuales;
    }

    public void setCantidadDescargasActuales(int cantidadDescargasActuales) {
        this.cantidadDescargasActuales = cantidadDescargasActuales;
    }
}
