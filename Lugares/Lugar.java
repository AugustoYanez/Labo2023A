package Lugares;

import java.util.ArrayList;

public class Lugar {

    private String nombre;

    private int codigo;

    private ArrayList<Coordenadas> cordenadas;


    public Lugar(String nombre, int codigo, ArrayList<Coordenadas> cordenadas) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cordenadas = cordenadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Coordenadas> getCordenadas() {
        return cordenadas;
    }

    public void setCordenadas(ArrayList<Coordenadas> cordenadas) {
        this.cordenadas = cordenadas;
    }

    public void altaLugares(Lugar lugarAagregar){




    }


}
