package Alarmas;

import Fecha.Fecha;

public class Sensor_presion extends Alarma {
    public Sensor_presion(boolean estado, int medida, int valorLimite, Fecha adquisicion) {
        super(estado,medida,valorLimite,adquisicion);
    }

    public void verificarMedida(){

        if ( this.getMedida() > this.getValorLimite()){
            System.out.println("SENSOR DE PRESION ACTIVADO. ");
        }

    }
}
