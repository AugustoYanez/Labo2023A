package Alarmas;

import Fecha.Fecha;

public class Detector_humo extends Alarma {
    public Detector_humo(boolean estado, int medida, int valorLimite, Fecha adquisicion) {
     super(estado,medida,valorLimite,adquisicion);
    }

public void verificarMedida(){

        if ( this.getMedida() > this.getValorLimite()){
            System.out.println("LLAMEN A LOS BOMBEROS. ");
        }

}
}
