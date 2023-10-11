package A.F.A;

public interface Contrato {

    boolean contratar(Equipo equipo) throws NoSePudoContratar;
    boolean renovar(Equipo equipo)   throws NoSePudoRenovar;
}
