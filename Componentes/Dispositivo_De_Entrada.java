package Componentes;

public class Dispositivo_De_Entrada extends Componente{

    String tipoConcetor;

    String puertoValido;

    public Dispositivo_De_Entrada() {
        super();
        tipoConcetor = " tipo default";
        puertoValido = " puerto default";
    }

    public Dispositivo_De_Entrada( String tipoConcetor, String puertoValido) {
        super();
        this.tipoConcetor = tipoConcetor;
        this.puertoValido = puertoValido;
    }

    public String getTipoConcetor() {
        return tipoConcetor;
    }

    public String getPuertoValido() {
        return puertoValido;
    }
}
