package Alarmas;

import Fecha.Fecha;

public class Sensor_temperatura extends Alarma {
    public Sensor_temperatura(boolean estado, int medida, int valorLimite, Fecha adquisicion) {
        super(estado,medida,valorLimite,adquisicion);
    }

    public void verificarMedida(){

        if ( this.getMedida() > this.getValorLimite()){
            System.out.println(" CUIDADO, LA TEMPERATURA SUBE. ");
        }

    }

}
