package Componentes;

public class Periferico extends Componente{

    int idPeriferico;

    public Periferico(){
        idPeriferico = 0;
    }
    public Periferico(int idPeriferico) {
        this.idPeriferico = idPeriferico;
    }

    public int getIdPeriferico() {
        return idPeriferico;
    }

    public void setIdPeriferico(int idPeriferico) {
        this.idPeriferico = idPeriferico;
    }
}
