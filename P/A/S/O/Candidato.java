package P.A.S.O;

import Fecha.Fecha;
import Personas.Persona;

import java.util.HashMap;

public class Candidato extends Persona {

private Partido_Politico partidoPolitico;

private HashMap<Provincia, Integer> cantidadVotosPorProvincia;


    public Partido_Politico getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(Partido_Politico partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public HashMap<Provincia, Integer> getCantidadVotosPorProvincia() {
        return cantidadVotosPorProvincia;
    }

    public void setCantidadVotosPorProvincia(HashMap<Provincia, Integer> cantidadVotosPorProvincia) {
        this.cantidadVotosPorProvincia = cantidadVotosPorProvincia;
    }
public Candidato(){

}
    public Candidato (String nombre, String apellido, int dni, Fecha nacimiento, Partido_Politico partidoPolitico, HashMap<Provincia, Integer> cantidadVotosPorProvincia){
        super(nombre,apellido,dni,nacimiento);
        this.partidoPolitico = partidoPolitico;
        this.cantidadVotosPorProvincia = cantidadVotosPorProvincia;
    }



    public int contarVotosTotales(){
        int cantidadTotalVotos = 0;
        for (Provincia provincia : partidoPolitico.getCandidato().getCantidadVotosPorProvincia().keySet()){
            cantidadTotalVotos = cantidadTotalVotos + partidoPolitico.getCandidato().getCantidadVotosPorProvincia().get(provincia);
        }
        return cantidadTotalVotos;
    }
}
