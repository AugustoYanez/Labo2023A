package Productos;

public class Televisor extends Cargadores{

    String tecnologia;

    int resolucion; // en pixeles

    public Televisor(){
        super();
        tecnologia = "HDR";
        resolucion = 4016;
    }
    public Televisor(String tecnologia, int resolucion) {
        this.tecnologia = tecnologia;
        this.resolucion = resolucion;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }
}
