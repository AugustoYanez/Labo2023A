package Alarmas;

import Fecha.Fecha;

public class Sensor_presion extends Alarma {
    public Sensor_presion(boolean estado, int medida, int valorLimite, Fecha adquisicion) {
        super(estado,medida,valorLimite,adquisicion);
    }

    public void consultarMedida() {
        if (getMedida() > getValorLimite()) {
            System.out.println("Sensor de presión activado");
        }
    }
}
