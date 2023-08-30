package P.A.S.O;

import Fecha.Fecha;
import Personas.Persona;

public class Votante extends Persona {

    private Boolean yaVoto;

    private String nacionalidad;

    private Provincia provinciaVotante;

    public Votante(String nombre, String apellido, int dni, Fecha nacimienton, Boolean yaVoto, String nacionalidad, Provincia provinciaVotante) {
        super(nombre,apellido,dni,nacimienton);
        this.yaVoto = yaVoto;
        this.nacionalidad = nacionalidad;
        this.provinciaVotante = provinciaVotante;
    }

    public Boolean getYaVoto() {
        return yaVoto;
    }

    public void setYaVoto(Boolean yaVoto) {
        this.yaVoto = yaVoto;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Provincia getProvinciaVotante() {
        return provinciaVotante;
    }

    public void setProvinciaVotante(Provincia provinciaVotante) {
        this.provinciaVotante = provinciaVotante;
    }

    public boolean aptoParaVotar(){
        if ( (this.nacionalidad == "ARGENTINA") || (this.nacionalidad == "argentina") ){
            return true;
        }
        else {
            return false;
        }
}

}
