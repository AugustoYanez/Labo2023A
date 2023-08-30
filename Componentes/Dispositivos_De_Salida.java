package Componentes;

public class Dispositivos_De_Salida extends Componente{

    String puertoValido;

    public Dispositivos_De_Salida(){
        super();
        puertoValido = "Puerto";
    }
    public Dispositivos_De_Salida(String puertoValido) {
        super();
        this.puertoValido = puertoValido;
    }

    public String getPuertoValido() {
        return puertoValido;
    }

    public void setPuertoValido(String puertoValido) {
        this.puertoValido = puertoValido;
    }

}
