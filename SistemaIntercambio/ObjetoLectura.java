package SistemaIntercambio;


public abstract class ObjetoLectura {

    private int codigo;

    private String titulo;

    private int añoPublicacion;

    public int getCodigo()  {
        return codigo;
    }

    public ObjetoLectura(int codigo, String titulo, int añoPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.añoPublicacion = añoPublicacion;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }




    @Override
    public String toString() {
        return "ObjetoLectura{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", añoPublicacion=" + añoPublicacion +
                '}';
    }


}
