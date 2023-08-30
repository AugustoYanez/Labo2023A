package Alarmas;

import Fecha.Fecha;

public class Sensor_temperatura extends Alarma {
    public Sensor_temperatura(boolean estado, int medida, int valorLimite, Fecha adquisicion) {
        super(estado,medida,valorLimite,adquisicion);
    }

    public void consultarMedida() {
        if (getMedida() > getValorLimite()) {
            System.out.println("¡Cuidado! La temperatura sube");
        }
    }

}
