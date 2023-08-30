package P.A.S.O;

import java.util.HashMap;
import java.util.HashSet;

public class Partido_Politico {

    private NombrePartido partido;

    private Candidato candidato;

    private HashMap<Tema,HashSet<String>> listaPropuesta;


    public Partido_Politico(NombrePartido partido,Candidato candidato, HashMap<Tema, HashSet<String>> listaPropuesta) {
        this.partido = partido;
        this.candidato = candidato;
        this.listaPropuesta = listaPropuesta;
    }

    public NombrePartido getPartido() {
        return partido;
    }

    public void setPartido(NombrePartido partido) {
        this.partido = partido;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public HashMap<Tema, HashSet<String>> getListaPropuesta() {
        return listaPropuesta;
    }

    public void setListaPropuesta(HashMap<Tema, HashSet<String>> listaPropuesta) {
        this.listaPropuesta = listaPropuesta;
    }


}
