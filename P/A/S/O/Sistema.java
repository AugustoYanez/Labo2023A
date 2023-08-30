package P.A.S.O;

import java.util.HashSet;
import java.util.Map;

public class Sistema {

    private HashSet<Votante> padronElectoral; // HABILITADOS

    private HashSet<Partido_Politico> listaPartidos;

    public Sistema(HashSet<Votante> padronElectoral, HashSet<Partido_Politico> listaPartidos) {

        for ( Votante votante : padronElectoral){ // elimina gente que no este apta para votar
            if (votante.aptoParaVotar() != true ){
                padronElectoral.remove(votante);
            }
        }
        this.padronElectoral = padronElectoral;
        this.listaPartidos = listaPartidos;
    }

    public HashSet<Votante> getPadronElectoral() {
        return padronElectoral;
    }

    public void setPadronElectoral(HashSet<Votante> padronElectoral) {
        this.padronElectoral = padronElectoral;
    }

    public HashSet<Partido_Politico> getListaPartidos() {
        return listaPartidos;
    }

    public void setListaPartidos(HashSet<Partido_Politico> listaPartidos) {
        this.listaPartidos = listaPartidos;
    }

    public void votar(Votante votante, Partido_Politico partidoPolitico){ // cambiar con la llave provincia el int de votos depende el votante

 if ( votante.getYaVoto() == true){
     System.out.println(votante.getApellido() + " Ya ha votado. ");
 }
 else {

     votante.setYaVoto(true);

     partidoPolitico.getCandidato().getCantidadVotosPorProvincia().put(votante.getProvinciaVotante(),partidoPolitico.getCandidato().getCantidadVotosPorProvincia().get(votante.getProvinciaVotante())+1);



 }



    }

    public void contarVotos(){

        int cantHabitantes = 50000000;


        for ( Partido_Politico partidoPolitico : listaPartidos){
            System.out.println("CANTIDAD DE VOTOS TOTALES: " + partidoPolitico.getCandidato().contarVotosTotales());
            System.out.println("PORCENATAJE EN LA POBLACION: " + ((partidoPolitico.getCandidato().contarVotosTotales() / cantHabitantes) * 100));
        }




        



    }

    public Candidato candidatoGanador(){

Candidato candidatoGanador = new Candidato();

for (Partido_Politico partidoPolitico : listaPartidos){

    if ( partidoPolitico.getCandidato().contarVotosTotales() > candidatoGanador.contarVotosTotales() ){
        candidatoGanador = partidoPolitico.getCandidato();
    }
}
        return candidatoGanador;
    }

    public int porcentajeNoVoto(){

        int porcentajeTotal;
        int cantHabitantes = 50000000;
        int cantidadDeNoVotantes = 0;
        for (Votante votante : padronElectoral){
            if ( votante.getYaVoto() != true){
                cantidadDeNoVotantes = cantidadDeNoVotantes +1;
            }
        }
        porcentajeTotal = (cantidadDeNoVotantes / cantHabitantes) * 100;


        return porcentajeTotal;

    }
}
